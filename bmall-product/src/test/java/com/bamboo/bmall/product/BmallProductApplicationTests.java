package com.bamboo.bmall.product;

import com.bamboo.bmall.product.entity.BrandEntity;
import com.bamboo.bmall.product.service.BrandService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class BmallProductApplicationTests {

	@Autowired
	BrandService brandService;
	@Test
	void contextLoads() {
		BrandEntity brandEntity = new BrandEntity();
		brandEntity.setName("miaoao");
		brandService.save(brandEntity);
	}

	@Test
	public void testQueryBrandlist(){
		List<BrandEntity> brandList = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
		brandList.forEach((item)-> System.out.println(item.getName()));
	}

}
