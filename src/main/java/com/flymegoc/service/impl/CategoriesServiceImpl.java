package com.flymegoc.service.impl;

import com.flymegoc.model.Categories;
import com.flymegoc.mapper.CategoriesMapper;
import com.flymegoc.service.ICategoriesService;
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
public class CategoriesServiceImpl extends ServiceImpl<CategoriesMapper, Categories> implements ICategoriesService {
	
}
