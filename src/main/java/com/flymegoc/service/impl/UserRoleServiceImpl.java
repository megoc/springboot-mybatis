package com.flymegoc.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.flymegoc.model.UserRole;
import com.flymegoc.mapper.UserRoleMapper;
import com.flymegoc.service.IUserRoleService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author FlyMegoc
 * @since 2017-04-28
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {
    @Override
    public List<UserRole> selectUserRoleListByUserId(Integer userId) {
        EntityWrapper<UserRole> userRoleEntityWrapper=new EntityWrapper<>();
        UserRole userRole=new UserRole();
        userRole.setSprUserId(userId);
        return super.selectList(new EntityWrapper<>(userRole));
    }
}
