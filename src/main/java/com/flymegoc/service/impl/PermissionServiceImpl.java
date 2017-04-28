package com.flymegoc.service.impl;

import com.flymegoc.model.Permission;
import com.flymegoc.mapper.PermissionMapper;
import com.flymegoc.service.IPermissionService;
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
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {
	
}
