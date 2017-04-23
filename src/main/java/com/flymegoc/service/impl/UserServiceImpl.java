package com.flymegoc.service.impl;

import com.flymegoc.mapper.SprUserMapper;
import com.flymegoc.model.SprUser;
import com.flymegoc.model.SprUserExample;
import com.flymegoc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by flymegoc on 2017/4/21.
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private SprUserMapper userMapper;

    @Override
    public long countByExample(SprUserExample example) {
        return userMapper.countByExample(example);
    }

    @Override
    public int deleteByExample(SprUserExample example) {
        return userMapper.deleteByExample(example);
    }

    @Override
    public int deleteByPrimaryKey(Integer sprUserId) {
        return userMapper.deleteByPrimaryKey(sprUserId);
    }

    @Override
    public int insert(SprUser record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(SprUser record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public List<SprUser> selectByExample(SprUserExample example) {
        return userMapper.selectByExample(example);
    }

    @Override
    public SprUser selectByPrimaryKey(Integer sprUserId) {
        return userMapper.selectByPrimaryKey(sprUserId);
    }

    @Override
    public int updateByExampleSelective(SprUser record, SprUserExample example) {
        return userMapper.updateByExampleSelective(record,example);
    }

    @Override
    public int updateByExample(SprUser record, SprUserExample example) {
        return userMapper.updateByExample(record,example);
    }

    @Override
    public int updateByPrimaryKeySelective(SprUser record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(SprUser record) {
        return userMapper.updateByPrimaryKey(record);
    }
}
