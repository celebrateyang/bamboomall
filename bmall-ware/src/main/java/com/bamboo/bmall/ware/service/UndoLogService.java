package com.bamboo.bmall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.bamboo.common.utils.PageUtils;
import com.bamboo.bmall.ware.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author yang
 * @email celebrateyang@gmail.com
 * @date 2020-12-19 15:30:57
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

