package com.bamboo.bmall.product.dao;

import com.bamboo.bmall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 * 
 * @author yang
 * @email celebrateyang@gmail.com
 * @date 2020-12-14 21:45:54
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {
	
}
