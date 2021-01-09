package com.bamboo.bmall.product.dao;

import com.bamboo.bmall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yang
 * @email celebrateyang@gmail.com
 * @date 2020-12-14 21:45:55
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
