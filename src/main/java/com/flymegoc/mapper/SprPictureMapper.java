package com.flymegoc.mapper;

import com.flymegoc.model.SprPicture;
import com.flymegoc.model.SprPictureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SprPictureMapper {
    long countByExample(SprPictureExample example);

    int deleteByExample(SprPictureExample example);

    int deleteByPrimaryKey(Float sprPictureId);

    int insert(SprPicture record);

    int insertSelective(SprPicture record);

    List<SprPicture> selectByExample(SprPictureExample example);

    SprPicture selectByPrimaryKey(Float sprPictureId);

    int updateByExampleSelective(@Param("record") SprPicture record, @Param("example") SprPictureExample example);

    int updateByExample(@Param("record") SprPicture record, @Param("example") SprPictureExample example);

    int updateByPrimaryKeySelective(SprPicture record);

    int updateByPrimaryKey(SprPicture record);
}