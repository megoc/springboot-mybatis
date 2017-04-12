package com.flymegoc.mapper;

import com.flymegoc.model.SprAppinfo;
import com.flymegoc.model.SprAppinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SprAppinfoMapper {
    long countByExample(SprAppinfoExample example);

    int deleteByExample(SprAppinfoExample example);

    int deleteByPrimaryKey(Integer sprAppinfoId);

    int insert(SprAppinfo record);

    int insertSelective(SprAppinfo record);

    List<SprAppinfo> selectByExample(SprAppinfoExample example);

    SprAppinfo selectByPrimaryKey(Integer sprAppinfoId);

    int updateByExampleSelective(@Param("record") SprAppinfo record, @Param("example") SprAppinfoExample example);

    int updateByExample(@Param("record") SprAppinfo record, @Param("example") SprAppinfoExample example);

    int updateByPrimaryKeySelective(SprAppinfo record);

    int updateByPrimaryKey(SprAppinfo record);
}