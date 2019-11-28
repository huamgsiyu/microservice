package com.syh.springcloud.service;

import com.syh.springcloud.entities.Dept;

import java.util.List;

public interface DeptService {
	
	boolean add(Dept dept);
	
	Dept get(Long id);
	
	List<Dept> list();
}
