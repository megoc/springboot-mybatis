package com.flymegoc.controller;

import com.flymegoc.service.ICategoriesService;
import com.flymegoc.service.IPictureService;
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
    private IPictureService pictureService;

    @Autowired
    private ICategoriesService categoryService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String indexPage(Model model){

        return "forward:/waterfall.html";
    }
}
