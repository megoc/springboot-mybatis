package com.flymegoc.mapper;

import com.flymegoc.model.SprRole;
import com.flymegoc.model.SprRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SprRoleMapper {
    long countByExample(SprRoleExample example);

    int deleteByExample(SprRoleExample example);

    int deleteByPrimaryKey(Integer sprRoleId);

    int insert(SprRole record);

    int insertSelective(SprRole record);

    List<SprRole> selectByExample(SprRoleExample example);

    SprRole selectByPrimaryKey(Integer sprRoleId);

    int updateByExampleSelective(@Param("record") SprRole record, @Param("example") SprRoleExample example);

    int updateByExample(@Param("record") SprRole record, @Param("example") SprRoleExample example);

    int updateByPrimaryKeySelective(SprRole record);

    int updateByPrimaryKey(SprRole record);
}