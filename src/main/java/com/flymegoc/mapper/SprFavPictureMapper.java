package com.flymegoc.mapper;

import com.flymegoc.model.SprFavPicture;
import com.flymegoc.model.SprFavPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SprFavPictureMapper {
    long countByExample(SprFavPictureExample example);

    int deleteByExample(SprFavPictureExample example);

    int deleteByPrimaryKey(Integer sprFavPictureId);

    int insert(SprFavPicture record);

    int insertSelective(SprFavPicture record);

    List<SprFavPicture> selectByExample(SprFavPictureExample example);

    SprFavPicture selectByPrimaryKey(Integer sprFavPictureId);

    int updateByExampleSelective(@Param("record") SprFavPicture record, @Param("example") SprFavPictureExample example);

    int updateByExample(@Param("record") SprFavPicture record, @Param("example") SprFavPictureExample example);

    int updateByPrimaryKeySelective(SprFavPicture record);

    int updateByPrimaryKey(SprFavPicture record);
}