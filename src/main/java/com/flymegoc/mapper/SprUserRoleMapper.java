package com.flymegoc.mapper;

import com.flymegoc.model.SprUserRole;
import com.flymegoc.model.SprUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SprUserRoleMapper {
    long countByExample(SprUserRoleExample example);

    int deleteByExample(SprUserRoleExample example);

    int deleteByPrimaryKey(Integer sprUserRoleId);

    int insert(SprUserRole record);

    int insertSelective(SprUserRole record);

    List<SprUserRole> selectByExample(SprUserRoleExample example);

    SprUserRole selectByPrimaryKey(Integer sprUserRoleId);

    int updateByExampleSelective(@Param("record") SprUserRole record, @Param("example") SprUserRoleExample example);

    int updateByExample(@Param("record") SprUserRole record, @Param("example") SprUserRoleExample example);

    int updateByPrimaryKeySelective(SprUserRole record);

    int updateByPrimaryKey(SprUserRole record);
}