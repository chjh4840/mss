package com.mss.category;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mss.category.service.CategoryService;
import com.mss.category.vo.CategoryVo;

@SpringBootTest
public class CategoryDeleteTest {
	
	@Autowired
	CategoryService categoryService;
	
	@Test
	public void DeleteTest() {
		int id = 5;
		
		int ds = categoryService.deleteCategory(id);
		System.out.println("delete : " + ds);
		List<CategoryVo> cs = categoryService.selectCategory();
		for(int i=0; i<cs.size(); i++) {
			System.out.println(cs.get(i));
		}
	}	
}
