package com.flymegoc.service.impl;

import com.flymegoc.mapper.SprCategoriesMapper;
import com.flymegoc.model.SprCategories;
import com.flymegoc.model.SprCategoriesExample;
import com.flymegoc.service.CategoryService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by flymegoc on 2017/4/12.
 */
@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private SprCategoriesMapper categoriesMapper;

    @Override
    public long countByExample(SprCategoriesExample example) {
        return categoriesMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SprCategoriesExample example) {
        return categoriesMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer sprCategoryId) {
        return categoriesMapper.deleteByPrimaryKey(sprCategoryId);
    }

    @Override
    public int insert(SprCategories record) {
        return categoriesMapper.insert(record);
    }

    @Override
    public int insertSelective(SprCategories record) {
        return categoriesMapper.insertSelective(record);
    }

    @Override
    public List<SprCategories> selectByExample(SprCategoriesExample example) {
        return categoriesMapper.selectByExample(example);
    }

    @Override
    public SprCategories selectByPrimaryKey(Integer sprCategoryId) {
        return categoriesMapper.selectByPrimaryKey(sprCategoryId);
    }

    @Override
    public int updateByExampleSelective(@Param("record") SprCategories record, @Param("example") SprCategoriesExample example) {
        return categoriesMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(@Param("record") SprCategories record, @Param("example") SprCategoriesExample example) {
        return categoriesMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(SprCategories record) {
        return categoriesMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SprCategories record) {
        return categoriesMapper.updateByPrimaryKey(record);
    }
}
