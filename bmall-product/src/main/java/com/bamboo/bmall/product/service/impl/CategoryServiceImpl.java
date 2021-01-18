package com.bamboo.bmall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bamboo.common.utils.PageUtils;
import com.bamboo.common.utils.Query;

import com.bamboo.bmall.product.dao.CategoryDao;
import com.bamboo.bmall.product.entity.CategoryEntity;
import com.bamboo.bmall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> queryListTree() {
        List<CategoryEntity> categoryEntities = baseMapper.selectList(null);
        //1.找到所有一级分类
        List<CategoryEntity> collect = categoryEntities.stream().
                filter(categoryEntity -> categoryEntity.getParentCid() == 0)
                .map((menu)->{menu.setChildren(getChildren(menu,categoryEntities));return menu;})
                .sorted(Comparator.comparingInt(entity -> entity.getCatId().intValue()))
                .collect(Collectors.toList());
        return collect;
    }

    private List<CategoryEntity> getChildren(CategoryEntity root,List<CategoryEntity> all){
        List<CategoryEntity> collect = all.stream().filter(categoryEntity -> root.getCatId().equals(categoryEntity.getParentCid()))
                .map((categoryEntity) -> {
                    categoryEntity.setChildren(getChildren(categoryEntity, all));
                    return categoryEntity;
                }).sorted(Comparator.comparingInt(entity->entity.getCatId().intValue()))
                .collect(Collectors.toList());
        return collect;
    }

}