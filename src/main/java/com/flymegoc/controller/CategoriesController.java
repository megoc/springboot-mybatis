package com.flymegoc.controller;

import com.flymegoc.model.Categories;
import com.flymegoc.service.ICategoriesService;
import com.flymegoc.utils.BaseResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author FlyMegoc
 * @since 2017-04-28
 */
@RestController
public class CategoriesController {
    @Autowired
    private ICategoriesService categoryService;

    @RequestMapping(value = "/api/findCategory",method = RequestMethod.GET)
    public BaseResult<List<Categories>> findCategory(){
        List<Categories> sprCategoriesList=categoryService.selectList(null);
        BaseResult<List<Categories>> baseResult=new BaseResult<>();
        baseResult.code=0;
        baseResult.message="success";
        baseResult.data=sprCategoriesList;

        return baseResult;
    }
}
