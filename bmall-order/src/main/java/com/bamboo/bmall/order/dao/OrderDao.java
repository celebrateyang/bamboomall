package com.bamboo.bmall.order.dao;

import com.bamboo.bmall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author yang
 * @email celebrateyang@gmail.com
 * @date 2020-12-19 15:26:09
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
