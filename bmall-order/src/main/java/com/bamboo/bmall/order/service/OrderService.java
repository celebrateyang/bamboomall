package com.bamboo.bmall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bamboo.common.utils.PageUtils;
import com.bamboo.bmall.order.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author yang
 * @email celebrateyang@gmail.com
 * @date 2020-12-19 15:26:09
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

