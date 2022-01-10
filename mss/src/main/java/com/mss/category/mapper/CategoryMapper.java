package com.mss.category.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;
import com.mss.category.vo.CategoryVo;

@Repository
@Mapper
public interface CategoryMapper {
	
	List<CategoryVo> select();
	List<CategoryVo> select_p(int f_id);
	int select_m();
	int insert(CategoryVo data);
	int update(CategoryVo data);
	int delete(int id);
}
