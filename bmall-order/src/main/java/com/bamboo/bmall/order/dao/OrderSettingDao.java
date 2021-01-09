package com.bamboo.bmall.order.dao;

import com.bamboo.bmall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author yang
 * @email celebrateyang@gmail.com
 * @date 2020-12-19 15:26:05
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
