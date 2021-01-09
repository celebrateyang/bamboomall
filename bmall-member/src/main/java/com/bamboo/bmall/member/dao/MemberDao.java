package com.bamboo.bmall.member.dao;

import com.bamboo.bmall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author yang
 * @email celebrateyang@gmail.com
 * @date 2020-12-19 15:17:54
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
