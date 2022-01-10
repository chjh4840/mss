package com.mss.category.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mss.category.mapper.CategoryMapper;
import com.mss.category.vo.CategoryVo;

@Service
public class CategoryService {
	
		@Autowired
		public CategoryMapper mapper;
		
		public List<CategoryVo> selectCategory(){
			return mapper.select();
		}
		
		public List<CategoryVo> selectCategory(int f_id){
			return mapper.select_p(f_id);
		}
		
		public int maxIdCategory(){
			return mapper.select_m();
		}
		
		public int insertCategory(CategoryVo data){
			return mapper.insert(data);
		}
		
		public int updateCategory(CategoryVo data){
			return mapper.update(data);
		}
		
		public int deleteCategory(int id) {
			return mapper.delete(id);
		}
}
