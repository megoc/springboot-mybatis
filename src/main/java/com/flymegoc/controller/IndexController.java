package com.flymegoc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by flymegoc on 2017/4/12.
 */
@RestController
public class IndexController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String indexPage(){
        return "hello word11";
    }
}
