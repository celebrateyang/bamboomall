package com.bamboo.bmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bamboo.common.utils.PageUtils;
import com.bamboo.bmall.product.entity.AttrEntity;

import java.util.Map;

/**
 * 商品属性
 *
 * @author yang
 * @email celebrateyang@gmail.com
 * @date 2020-12-14 21:45:58
 */
public interface AttrService extends IService<AttrEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

