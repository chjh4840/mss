package com.mss.category.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mss.category.service.CategoryService;
import com.mss.category.vo.CategoryVo;

@RestController
public class CategoryController {

	@Autowired
	CategoryService categoryService;
	
	@RequestMapping(value = "/setting/modify", method = RequestMethod.GET)
	public void modifyCategory(@RequestParam(name="id") int id, @RequestParam(name="name") String name) {
		CategoryVo data = CategoryVo.builder()
				.id(id)
				.name(name)
				.build();	
		int cnt = categoryService.updateCategory(data);
		System.out.println("수정 ID : " + data);
		System.out.println("수정 건수 : " + cnt);
	}
	
	@RequestMapping(value = "/setting/delete", method = RequestMethod.GET)
	public void deleteCategory(@RequestParam(name="id") int id) {
		int cnt = categoryService.deleteCategory(id);
		System.out.println("삭제 ID : " + id);
		System.out.println("삭제 건수 : " + cnt);
	}
	
	@RequestMapping(value = "/setting/add_d", method = RequestMethod.GET)
	public void addCategory(@RequestParam(name="id") int id, @RequestParam(name="name") String name) {
		int maxId = categoryService.maxIdCategory();
		CategoryVo data = CategoryVo.builder()
				.id(maxId+1)
				.f_id(id)
				.name(name)
				.build();	
		int cnt = categoryService.insertCategory(data);
		System.out.println("추가 ID : " + data);
		System.out.println("추가 건수 : " + cnt);
	}
	
	@RequestMapping(value = "/setting/add_m", method = RequestMethod.GET)
	public void addCategory(@RequestParam(name="name") String name) {
		int maxId = categoryService.maxIdCategory();
		CategoryVo data = CategoryVo.builder()
				.id(maxId+1)
				.f_id(0)
				.name(name)
				.build();	
		int cnt = categoryService.insertCategory(data);
		System.out.println("추가 ID : " + data);
		System.out.println("추가 건수 : " + cnt);
	}
}
