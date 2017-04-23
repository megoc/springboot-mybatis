package com.flymegoc.mapper;

import com.flymegoc.model.SprPermission;
import com.flymegoc.model.SprPermissionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SprPermissionMapper {
    long countByExample(SprPermissionExample example);

    int deleteByExample(SprPermissionExample example);

    int deleteByPrimaryKey(Integer sprPermissionId);

    int insert(SprPermission record);

    int insertSelective(SprPermission record);

    List<SprPermission> selectByExample(SprPermissionExample example);

    SprPermission selectByPrimaryKey(Integer sprPermissionId);

    int updateByExampleSelective(@Param("record") SprPermission record, @Param("example") SprPermissionExample example);

    int updateByExample(@Param("record") SprPermission record, @Param("example") SprPermissionExample example);

    int updateByPrimaryKeySelective(SprPermission record);

    int updateByPrimaryKey(SprPermission record);
}