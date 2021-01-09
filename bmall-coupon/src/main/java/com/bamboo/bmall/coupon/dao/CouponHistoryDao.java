package com.bamboo.bmall.coupon.dao;

import com.bamboo.bmall.coupon.entity.CouponHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券领取历史记录
 * 
 * @author yang
 * @email celebrateyang@gmail.com
 * @date 2020-12-19 14:42:37
 */
@Mapper
public interface CouponHistoryDao extends BaseMapper<CouponHistoryEntity> {
	
}
