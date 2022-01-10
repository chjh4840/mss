package com.mss.category;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mss.category.service.CategoryService;
import com.mss.category.vo.CategoryVo;

@SpringBootTest
public class CategoryUpdateTest {
	
	@Autowired
	CategoryService categoryService;
	
	@Test
	public void updateTest() {
		CategoryVo data = CategoryVo.builder()
			.id(1)
			.f_id(1)
			.name("첫번째수정")
			.build();
		
		int us = categoryService.updateCategory(data);
		System.out.println("update : " + us);
		List<CategoryVo> cs = categoryService.selectCategory();
		for(int i=0; i<cs.size(); i++) {
			System.out.println(cs.get(i));
		}
	}
}
