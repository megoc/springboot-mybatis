package com.flymegoc.mapper;

import com.flymegoc.model.SprFavCategories;
import com.flymegoc.model.SprFavCategoriesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SprFavCategoriesMapper {
    long countByExample(SprFavCategoriesExample example);

    int deleteByExample(SprFavCategoriesExample example);

    int deleteByPrimaryKey(Integer sprFavCategoriesId);

    int insert(SprFavCategories record);

    int insertSelective(SprFavCategories record);

    List<SprFavCategories> selectByExample(SprFavCategoriesExample example);

    SprFavCategories selectByPrimaryKey(Integer sprFavCategoriesId);

    int updateByExampleSelective(@Param("record") SprFavCategories record, @Param("example") SprFavCategoriesExample example);

    int updateByExample(@Param("record") SprFavCategories record, @Param("example") SprFavCategoriesExample example);

    int updateByPrimaryKeySelective(SprFavCategories record);

    int updateByPrimaryKey(SprFavCategories record);
}