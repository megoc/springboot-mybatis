package com.flymegoc.controller;

import com.flymegoc.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by flymegoc on 2017/4/12.
 */
@RestController
public class PictureController {

    @Autowired
    private PictureService pictureService;

    @RequestMapping(value = "",params = "categoryId",method = RequestMethod.GET)
    public void queryPicture(){

    }
}
