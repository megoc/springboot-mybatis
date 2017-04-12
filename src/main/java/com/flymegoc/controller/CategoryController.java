package com.flymegoc.controller;

import com.flymegoc.model.SprCategories;
import com.flymegoc.service.CategoryService;
import com.flymegoc.utils.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by flymegoc on 2017/4/12.
 */
@RestController
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @RequestMapping(value = "/api/findCategory",method = RequestMethod.GET)
    public BaseResult<List<SprCategories>> findCategory(){
        List<SprCategories> sprCategoriesList=categoryService.selectByExample(null);
        BaseResult<List<SprCategories>> baseResult=new BaseResult<>();
        baseResult.code=0;
        baseResult.message="success";
        baseResult.data=sprCategoriesList;

        return baseResult;
    }

}
