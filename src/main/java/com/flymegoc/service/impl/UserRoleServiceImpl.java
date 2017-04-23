package com.flymegoc.service.impl;

import com.flymegoc.mapper.SprUserRoleMapper;
import com.flymegoc.model.SprUserRole;
import com.flymegoc.model.SprUserRoleExample;
import com.flymegoc.service.UserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by flymegoc on 2017/4/21.
 */
@Service
public class UserRoleServiceImpl implements UserRoleService{

    @Autowired
    private SprUserRoleMapper userRoleMapper;

    @Override
    public long countByExample(SprUserRoleExample example) {
        return userRoleMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SprUserRoleExample example) {
        return userRoleMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer sprUserRoleId) {
        return userRoleMapper.deleteByPrimaryKey(sprUserRoleId);
    }

    @Override
    public int insert(SprUserRole record) {
        return userRoleMapper.insert(record);
    }

    @Override
    public int insertSelective(SprUserRole record) {
        return userRoleMapper.insertSelective(record);
    }

    @Override
    public List<SprUserRole> selectByExample(SprUserRoleExample example) {
        return userRoleMapper.selectByExample(example);
    }

    @Override
    public SprUserRole selectByPrimaryKey(Integer sprUserRoleId) {
        return userRoleMapper.selectByPrimaryKey(sprUserRoleId);
    }

    @Override
    public int updateByExampleSelective(SprUserRole record, SprUserRoleExample example) {
        return userRoleMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(SprUserRole record, SprUserRoleExample example) {
        return userRoleMapper.updateByExample(record, example);
    }

    @Override
    public int updateByPrimaryKeySelective(SprUserRole record) {
        return userRoleMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SprUserRole record) {
        return userRoleMapper.updateByPrimaryKey(record);
    }
}
