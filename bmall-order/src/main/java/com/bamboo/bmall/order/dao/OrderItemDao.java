package com.bamboo.bmall.order.dao;

import com.bamboo.bmall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author yang
 * @email celebrateyang@gmail.com
 * @date 2020-12-19 15:26:08
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
