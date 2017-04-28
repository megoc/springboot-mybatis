package com.flymegoc.service;

import com.flymegoc.model.User;
import com.baomidou.mybatisplus.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author FlyMegoc
 * @since 2017-04-28
 */
public interface IUserService extends IService<User> {
	User selectByLoginName(String loginName);
}
