package com.mss.category.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mss.category.service.CategoryService;
import com.mss.category.vo.CategoryVo;

@Controller
public class MainController {
	@Autowired
	CategoryService categoryService;
	
	@GetMapping("/")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("index");
		List<CategoryVo> r1 = categoryService.selectCategory();
		List<CategoryVo> r2 = new ArrayList<CategoryVo>();
		for(int i=0; i<r1.size(); i++) {
			if(r1.get(i).getF_id()!=0) {
				r2.add(r1.get(i));
			}
		}
		
		r1.clear();
		r1 = categoryService.selectCategory(0);
		modelAndView.addObject("id_list", r1);
		modelAndView.addObject("fid_list", r2);
		return modelAndView;
	}
	
	@GetMapping("/setting")
	public ModelAndView list() {
		ModelAndView modelAndView = new ModelAndView("setting");
		List<CategoryVo> r1 = categoryService.selectCategory();
		List<CategoryVo> r2 = new ArrayList<CategoryVo>();
		for(int i=0; i<r1.size(); i++) {
			if(r1.get(i).getF_id()!=0) {
				r2.add(r1.get(i));
			}
		}
		
		r1.clear();
		r1 = categoryService.selectCategory(0);
		modelAndView.addObject("id_list", r1);
		modelAndView.addObject("fid_list", r2);
		return modelAndView;
	}
}
