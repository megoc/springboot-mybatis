package com.flymegoc.utils;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import com.flymegoc.model.Picture;
import com.flymegoc.ohermodel.FileBean;
import com.flymegoc.ohermodel.HuaBanRoot;
import com.flymegoc.ohermodel.PinsBean;
import com.flymegoc.ohermodel.board.BoardRoot;
import com.flymegoc.ohermodel.pins.PinsRoot;

import com.flymegoc.service.HuaBanService;
import com.flymegoc.service.IPictureService;
import okhttp3.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**抓取并保存数据
 * Created by flymegoc on 2017/4/12.
 */
@Component
public class HuaBanUtils {

    @Autowired
    private IPictureService pictureService;
    DecimalFormat decimalFormat=new DecimalFormat("#.00");
    //主页面抓取
    public void getHuaBan(HuaBanService huaBanService, String url, int categoryId) {
        Call<ResponseBody> call = huaBanService.getHuaban(url);
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    //开始解析
                    String sourceStr = response.body().string();
                    String patternStr = "app.page\\[\"pins\"\\] = .*";

                    Pattern pattern = Pattern.compile(patternStr);

                    Matcher matcher = pattern.matcher(sourceStr);
                    while (matcher.find()) {
                        String jsonStr = matcher.group(0).replace("app.page[\"pins\"] = ", "").replace(";", "");

                        System.out.println(jsonStr);
                        ObjectMapper mapper = new ObjectMapper();
                        List<HuaBanRoot> huaBanRootList = mapper.readValue(jsonStr, new TypeReference<List<HuaBanRoot>>() {
                        });
                        Date date=new Date();
                        for (HuaBanRoot huaBanRoot : huaBanRootList) {

                            Picture picture=new Picture();
                            picture.setSprPictureBoardid(huaBanRoot.getBoard_id()+"");
                            picture.setSprPicturePinid(huaBanRoot.getPin_id()+"");

                            FileBean fileBean=huaBanRoot.getFile();
                            picture.setSprPictureId((float) fileBean.getId());
                            picture.setSprPictureBucket(fileBean.getBucket());
                            picture.setSprPictureKey(fileBean.getKey());
                            if(!fileBean.getType().equals("image/jpeg")&&!fileBean.getType().equals("image/png")){
                                continue;
                            }
                            picture.setSprPictureType(fileBean.getType());
                            picture.setSprPictureWidth(fileBean.getWidth());
                            picture.setSprPictureHeight(fileBean.getHeight());
                            double ratio=(double) fileBean.getWidth()/fileBean.getHeight();
                            picture.setSprPictureRatio(Double.valueOf(decimalFormat.format(ratio)));
                            picture.setSprPictureReads(0);
                            picture.setSprPictureLikes(0);
                            picture.setSprPictureCategoryid(categoryId);
                            picture.setSprPictureCreateTime(date);
                            picture.setSprPictureUpdateTime(date);
                            savePicture(picture);
                            getBoards(huaBanService,huaBanRoot.getBoard_id(), categoryId);
                            getPins(huaBanService,huaBanRoot.getPin_id(),categoryId);

                            try {
                                Thread.sleep(1500);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }

                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable throwable) {

            }
        });
    }

    //照片墙
    public void getPins(HuaBanService huaBanService,int pinId,int categoryId) {
        Call<ResponseBody> call1 = huaBanService.getPin(pinId);
        call1.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    //开始解析
                    String sourceStr = response.body().string();
                    String patternStr = "app.page\\[\"pin\"\\] = .*";

                    Pattern pattern = Pattern.compile(patternStr);

                    Matcher matcher = pattern.matcher(sourceStr);
                    while (matcher.find()) {
                        String jsonStr = matcher.group(0).replace("app.page[\"pin\"] = ", "").replace(";", "");
                        ObjectMapper mapper = new ObjectMapper();
                        PinsRoot pinsRoot = mapper.readValue(jsonStr, PinsRoot.class);
                        Date date=new Date();
                        for (PinsBean pinsBean : pinsRoot.getBoard().getPins()) {

                            Picture picture=new Picture();
                            picture.setSprPictureBoardid(pinsBean.getBoard_id()+"");
                            picture.setSprPicturePinid(pinsBean.getPin_id()+"");

                            FileBean fileBean=pinsBean.getFile();
                            picture.setSprPictureId((float) fileBean.getId());
                            picture.setSprPictureBucket(fileBean.getBucket());
                            picture.setSprPictureKey(fileBean.getKey());
                            if(!fileBean.getType().equals("image/jpeg")&&!fileBean.getType().equals("image/png")){
                                continue;
                            }
                            picture.setSprPictureType(fileBean.getType());
                            picture.setSprPictureWidth(fileBean.getWidth());
                            picture.setSprPictureHeight(fileBean.getHeight());
                            double ratio=(double)fileBean.getWidth()/fileBean.getHeight();
                            picture.setSprPictureRatio(Double.valueOf(decimalFormat.format(ratio)));
                            picture.setSprPictureReads(0);
                            picture.setSprPictureLikes(0);
                            picture.setSprPictureCategoryid(categoryId);
                            picture.setSprPictureCreateTime(date);
                            picture.setSprPictureUpdateTime(date);

                            savePicture(picture);
                        }

                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable throwable) {

            }
        });
    }

    //画板
    public void getBoards(HuaBanService huaBanService, int boardId, Integer categoryId) {
        Call<ResponseBody> call2 = huaBanService.getBoard(boardId);
        call2.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    //开始解析
                    String sourceStr = response.body().string();
                    String patternStr = "app.page\\[\"board\"\\] = .*";

                    Pattern pattern = Pattern.compile(patternStr);

                    Matcher matcher = pattern.matcher(sourceStr);
                    while (matcher.find()) {
                        String jsonStr = matcher.group(0).replace("app.page[\"board\"] = ", "").replace(";", "");
                        ObjectMapper objectMapper = new ObjectMapper();
                        BoardRoot boardRoot = objectMapper.readValue(jsonStr, BoardRoot.class);
                        Date date=new Date();
                        for (PinsBean pinsBean : boardRoot.getPins()) {

                            Picture picture=new Picture();
                            picture.setSprPictureBoardid(pinsBean.getBoard_id()+"");
                            picture.setSprPicturePinid(pinsBean.getPin_id()+"");

                            FileBean fileBean=pinsBean.getFile();
                            picture.setSprPictureId((float) fileBean.getId());
                            picture.setSprPictureBucket(fileBean.getBucket());
                            picture.setSprPictureKey(fileBean.getKey());
                            if(!fileBean.getType().equals("image/jpeg")&&!fileBean.getType().equals("image/png")){
                                continue;
                            }
                            picture.setSprPictureType(fileBean.getType());
                            picture.setSprPictureWidth(fileBean.getWidth());
                            picture.setSprPictureHeight(fileBean.getHeight());
                            double ratio=(double)fileBean.getWidth()/fileBean.getHeight();
                            picture.setSprPictureRatio(Double.valueOf(decimalFormat.format(ratio)));
                            picture.setSprPictureReads(0);
                            picture.setSprPictureLikes(0);
                            picture.setSprPictureCategoryid(categoryId);
                            picture.setSprPictureCreateTime(date);
                            picture.setSprPictureUpdateTime(date);

                            savePicture(picture);
                        }

                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable throwable) {

            }
        });
    }
    //将图片保存到数据库中
    private void savePicture(Picture picture){
        Picture sprPicture=pictureService.selectById(picture.getSprPictureId());
        if (sprPicture!=null){
            return;
        }
        pictureService.insert(picture);
    }
}
