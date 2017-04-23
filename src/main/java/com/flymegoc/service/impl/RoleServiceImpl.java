package com.flymegoc.service.impl;

import com.flymegoc.mapper.SprRoleMapper;
import com.flymegoc.model.SprRole;
import com.flymegoc.model.SprRoleExample;
import com.flymegoc.service.RoleService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by flymegoc on 2017/4/21.
 */
@Service
public class RoleServiceImpl implements RoleService{

    private SprRoleMapper roleMapper;

    @Override
    public long countByExample(SprRoleExample example) {
        return roleMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SprRoleExample example) {
        return roleMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer sprRoleId) {
        return roleMapper.deleteByPrimaryKey(sprRoleId);
    }

    @Override
    public int insert(SprRole record) {
        return roleMapper.insert(record);
    }

    @Override
    public int insertSelective(SprRole record) {
        return roleMapper.insertSelective(record);
    }

    @Override
    public List<SprRole> selectByExample(SprRoleExample example) {
        return roleMapper.selectByExample(example);
    }

    @Override
    public SprRole selectByPrimaryKey(Integer sprRoleId) {
        return roleMapper.selectByPrimaryKey(sprRoleId);
    }

    @Override
    public int updateByExampleSelective(SprRole record, SprRoleExample example) {
        return roleMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(SprRole record, SprRoleExample example) {
        return roleMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(SprRole record) {
        return roleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SprRole record) {
        return roleMapper.updateByPrimaryKey(record);
    }
}
