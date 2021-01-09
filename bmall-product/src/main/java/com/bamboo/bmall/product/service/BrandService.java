package com.bamboo.bmall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bamboo.common.utils.PageUtils;
import com.bamboo.bmall.product.entity.BrandEntity;

import java.util.Map;

/**
 * 品牌
 *
 * @author yang
 * @email celebrateyang@gmail.com
 * @date 2020-12-14 21:45:57
 */
public interface BrandService extends IService<BrandEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

