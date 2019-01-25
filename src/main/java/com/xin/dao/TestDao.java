package com.xin.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

public interface TestDao {
	
	public String getSexByName(@Param(value="id")String id);
	
    public List<Map<String,String>>	getList();
    
    public Integer save(Map<String,Object> map);
    
    public Integer update(String s);

}
