package com.bamboo.bmall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bamboo.common.utils.PageUtils;
import com.bamboo.bmall.member.entity.MemberEntity;

import java.util.Map;

/**
 * 会员
 *
 * @author yang
 * @email celebrateyang@gmail.com
 * @date 2020-12-19 15:17:54
 */
public interface MemberService extends IService<MemberEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

