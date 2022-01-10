package com.mss.category;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mss.category.service.CategoryService;
import com.mss.category.vo.CategoryVo;

@SpringBootTest
public class CategoryInsertTest {
	
	@Autowired
	CategoryService categoryService;
	
	@Test
	public void InsertTest() {
		List<CategoryVo> dataList = new ArrayList<CategoryVo>();
		CategoryVo data;
		for(int i=1; i<=5; i++) {
			data = CategoryVo.builder()
					.id(i+10)
					.f_id(0)
					.name(i+5+"번째_언더")
					.build();	
			dataList.add(data);
		}
		int is = 0;
		for(CategoryVo d : dataList) {
			is += categoryService.insertCategory(d);
		}
		System.out.println("insert : " + is);
		List<CategoryVo> cs = categoryService.selectCategory();
		for(int i=0; i<cs.size(); i++) {
			System.out.println(cs.get(i));
		}
	}
}
