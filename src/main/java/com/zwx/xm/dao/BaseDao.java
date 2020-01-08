package com.zwx.xm.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface BaseDao <T>{
	List<T> select(T t);
	
	int insert(T t);
	int update(T t);
	T selectbyid(Integer id);
	int delete(@Param("ids")String ids);	
}
