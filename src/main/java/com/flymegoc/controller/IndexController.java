package com.flymegoc.controller;

import com.flymegoc.model.SprCategories;
import com.flymegoc.model.SprPicture;
import com.flymegoc.model.SprPictureExample;
import com.flymegoc.service.CategoryService;
import com.flymegoc.service.PictureService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by flymegoc on 2017/4/12.
 */
@Controller
public class IndexController {

    @Autowired
    private PictureService pictureService;

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String indexPage(Model model){

        return "forward:/index.html";
    }
}
