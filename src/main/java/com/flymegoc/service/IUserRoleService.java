package com.flymegoc.service;

import com.flymegoc.model.UserRole;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author FlyMegoc
 * @since 2017-04-28
 */
public interface IUserRoleService extends IService<UserRole> {
    List<UserRole> selectUserRoleListByUserId(Integer userId);
}
