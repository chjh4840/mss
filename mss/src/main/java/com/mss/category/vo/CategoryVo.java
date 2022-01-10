package com.mss.category.vo;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@Builder
public class CategoryVo {
	private int id;
	private int f_id;
	private String name;
}
