package com.mss.category;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mss.category.service.CategoryService;
import com.mss.category.vo.CategoryVo;

@SpringBootTest
public class CategorySelectTest {
	
	@Autowired
	CategoryService categoryService;
	
	@Test
	public void selectTest() {
		List<CategoryVo> cs = categoryService.selectCategory();
		for(int i=0; i<cs.size(); i++) {
			System.out.println(cs.get(i));
		}
	}

}
