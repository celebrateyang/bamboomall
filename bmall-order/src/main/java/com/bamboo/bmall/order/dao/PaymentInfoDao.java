package com.bamboo.bmall.order.dao;

import com.bamboo.bmall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author yang
 * @email celebrateyang@gmail.com
 * @date 2020-12-19 15:26:04
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
