package com.flymegoc.mapper;

import com.flymegoc.model.SprUser;
import com.flymegoc.model.SprUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SprUserMapper {
    long countByExample(SprUserExample example);

    int deleteByExample(SprUserExample example);

    int deleteByPrimaryKey(Integer sprUserId);

    int insert(SprUser record);

    int insertSelective(SprUser record);

    List<SprUser> selectByExample(SprUserExample example);

    SprUser selectByPrimaryKey(Integer sprUserId);

    int updateByExampleSelective(@Param("record") SprUser record, @Param("example") SprUserExample example);

    int updateByExample(@Param("record") SprUser record, @Param("example") SprUserExample example);

    int updateByPrimaryKeySelective(SprUser record);

    int updateByPrimaryKey(SprUser record);
}