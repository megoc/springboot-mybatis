package com.flymegoc.controller;

import com.flymegoc.model.SprPicture;
import com.flymegoc.model.SprPictureExample;
import com.flymegoc.service.PictureService;
import com.flymegoc.utils.BaseResult;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flymegoc on 2017/4/12.
 */
@RestController
public class PictureController {

    @Autowired
    private PictureService pictureService;

    @RequestMapping(value = "api/queryPicture/categoryId/{categoryId}/page/{page}",method = RequestMethod.GET)
    public BaseResult<List<SprPicture>> queryPicture(@PathVariable("categoryId") int categoryId, @PathVariable("page") int page){
        SprPictureExample pictureExample=new SprPictureExample();
        List<String> imgageTypes=new ArrayList<>();
        imgageTypes.add("image/jpeg");
        imgageTypes.add("image/png");
        pictureExample.or().andSprPictureTypeIn(imgageTypes).andSprPictureCategoryidEqualTo(categoryId);
       // pictureExample.or().andSprPictureCategoryidEqualTo(categoryId);
        PageHelper.startPage(page,10);
        List<SprPicture> sprPictureList=pictureService.selectByExample(pictureExample);

        BaseResult<List<SprPicture>> baseResult=new BaseResult<>();
        baseResult.data=sprPictureList;
        baseResult.code=0;
        baseResult.message="success";

        return baseResult;
    }
}
