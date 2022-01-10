package com.mss.category;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mss.category.service.CategoryService;
import com.mss.category.vo.CategoryVo;

@SpringBootTest
public class CategoryTotalTest {
	
	@Autowired
	CategoryService categoryService;
	
	@Test
	public void totalTest() {
		CategoryVo data1 = CategoryVo.builder()
			.id(1).f_id(0).name("첫번째").build();
		
		CategoryVo data2 = CategoryVo.builder()
			.id(2).f_id(0).name("두번째").build();
		
		CategoryVo uData = CategoryVo.builder()
			.id(1).f_id(5).name("첫번째수정").build();
		
		int is = categoryService.insertCategory(data1);
		is += categoryService.insertCategory(data2);
		List<CategoryVo> cs = categoryService.selectCategory();
		System.out.println("## 데이터 INSERT : " + is + " ##");
		for(int i=0; i<cs.size(); i++) {
			System.out.println(cs.get(i));
		}
		cs.clear();
		int us = categoryService.updateCategory(uData);
		cs = categoryService.selectCategory();
		System.out.println("## 데이터 UPDATE : " + us + " ##");
		for(int i=0; i<cs.size(); i++) {
			System.out.println(cs.get(i));
		}
		
		cs.clear();
		int ds = categoryService.deleteCategory(2);
		cs = categoryService.selectCategory();
		System.out.println("## 데이터 DELETE : " + ds + " ##");
		for(int i=0; i<cs.size(); i++) {
			System.out.println(cs.get(i));
		}
	}
}
