package com.flymegoc.mapper;

import com.flymegoc.model.SprCategories;
import com.flymegoc.model.SprCategoriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SprCategoriesMapper {
    long countByExample(SprCategoriesExample example);

    int deleteByExample(SprCategoriesExample example);

    int deleteByPrimaryKey(Integer sprCategoryId);

    int insert(SprCategories record);

    int insertSelective(SprCategories record);

    List<SprCategories> selectByExample(SprCategoriesExample example);

    SprCategories selectByPrimaryKey(Integer sprCategoryId);

    int updateByExampleSelective(@Param("record") SprCategories record, @Param("example") SprCategoriesExample example);

    int updateByExample(@Param("record") SprCategories record, @Param("example") SprCategoriesExample example);

    int updateByPrimaryKeySelective(SprCategories record);

    int updateByPrimaryKey(SprCategories record);
}