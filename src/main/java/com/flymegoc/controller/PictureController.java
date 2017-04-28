package com.flymegoc.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.flymegoc.model.Picture;
import com.flymegoc.service.IPictureService;
import com.flymegoc.utils.BaseResult;

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
    private IPictureService pictureService;

    @RequestMapping(value = "api/queryPicture/categoryId/{categoryId}/page/{page}/pageSize/{pageSize}", method = RequestMethod.GET)
    public BaseResult<List<Picture>> queryPictureByPathVariable(@PathVariable("categoryId") int categoryId, @PathVariable("page") int page, @PathVariable("pageSize") int pageSize) {
        return queryPicture(categoryId, page, pageSize);
    }

    @RequestMapping(value = "api/queryPicture/", method = RequestMethod.GET)
    public BaseResult<List<Picture>> queryPictureByRequestParam(@RequestParam("categoryId") int categoryId, @RequestParam("page") int page, @RequestParam("pageSize") int pageSize) {

        return queryPicture(categoryId, page, pageSize);
    }


    public BaseResult<List<Picture>> queryPicture(int categoryId, int page, int pageSize) {

        if (pageSize <= 0) {
            pageSize = 10;
        }
        Page<Picture> picturePage = new Page<>();
        picturePage.setCurrent(page);
        picturePage.setSize(pageSize);
        picturePage.setOrderByField("spr_picture_create_time");
        picturePage.setAsc(false);

        EntityWrapper<Picture> pictureEntityWrapper = new EntityWrapper<>();
        Picture picture = new Picture();
        pictureEntityWrapper.where("spr_picture_type='image/jpeg'").or("spr_picture_type='image/png'").andNew("spr_picture_categoryid=" + categoryId);

        Page<Picture> pageResult = pictureService.selectPage(picturePage, pictureEntityWrapper);

        BaseResult<List<Picture>> baseResult = new BaseResult<>();
        baseResult.data = pageResult.getRecords();
        baseResult.code = 0;
        baseResult.message = "success";

        return baseResult;
    }
}
