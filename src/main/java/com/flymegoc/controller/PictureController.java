package com.flymegoc.controller;

import com.flymegoc.model.SprPicture;
import com.flymegoc.model.SprPictureExample;
import com.flymegoc.service.PictureService;
import com.flymegoc.utils.BaseResult;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flymegoc on 2017/4/12.
 */
@RestController
public class PictureController {

    @Autowired
    private PictureService pictureService;

    @RequestMapping(value = "api/queryPicture/categoryId/{categoryId}/page/{page}", method = RequestMethod.GET)
    public BaseResult<List<SprPicture>> queryPictureByPathVariable(@PathVariable("categoryId") int categoryId, @PathVariable("page") int page, @PathVariable("pageSize") int pageSize) {
        return queryPicture(categoryId, page, pageSize);
    }

    @RequestMapping(value = "api/queryPicture/", method = RequestMethod.GET)
    public BaseResult<List<SprPicture>> queryPictureByRequestParam(@RequestParam("categoryId") int categoryId, @RequestParam("page") int page, @RequestParam("pageSize") int pageSize) {

        return queryPicture(categoryId, page, pageSize);
    }


    public BaseResult<List<SprPicture>> queryPicture(int categoryId, int page, int pageSize) {
        SprPictureExample pictureExample = new SprPictureExample();
        List<String> imgageTypes = new ArrayList<>();
        imgageTypes.add("image/jpeg");
        imgageTypes.add("image/png");
        pictureExample.or().andSprPictureTypeIn(imgageTypes).andSprPictureCategoryidEqualTo(categoryId).andSprPictureHeightLessThan(8000);
        pictureExample.setOrderByClause("spr_picture_create_time desc");
        // pictureExample.or().andSprPictureCategoryidEqualTo(categoryId);
        if (pageSize <= 0) {
            pageSize = 10;
        }
        PageHelper.startPage(page, pageSize);
        List<SprPicture> sprPictureList = pictureService.selectByExample(pictureExample);

        BaseResult<List<SprPicture>> baseResult = new BaseResult<>();
        baseResult.data = sprPictureList;
        baseResult.code = 0;
        baseResult.message = "success";

        return baseResult;
    }
}
