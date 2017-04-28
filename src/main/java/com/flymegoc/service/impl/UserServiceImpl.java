package com.flymegoc.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.flymegoc.model.User;
import com.flymegoc.mapper.UserMapper;
import com.flymegoc.service.IUserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author FlyMegoc
 * @since 2017-04-28
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public User selectByLoginName(String loginName) {
        User user=new User();
        user.setSprUserName(loginName);
        return super.selectOne(new EntityWrapper<>(user));
    }
}
