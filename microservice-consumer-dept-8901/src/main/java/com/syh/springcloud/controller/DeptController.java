package com.syh.springcloud.controller;

import com.syh.springcloud.entities.Dept;
import com.syh.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DeptController {
//	Ribbon负载均衡
//	@Autowired
//	private RestTemplate restTemplate;
//
////	private final static String REST_URL_PREFIX = "http://localhost:8801";
//	private final static String REST_URL_PREFIX = "http://MICROSERVICE-PROV-DEPT";
//
//	@RequestMapping(value = "/consumer/dept/add")
//	public boolean add (Dept dept) {
//		return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
//	}
//
//	@RequestMapping(value = "/consumer/dept/get/{id}")
//	public Dept get (@PathVariable("id") Long id) {
//		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
//	}
//
//	@SuppressWarnings("unchecked")
//	@RequestMapping(value = "/consumer/dept/list")
//	public List<Dept> list () {
//		return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
//	}


//	Feign声明式、模板化的HTTP客户端。
	@Autowired
	private DeptClientService service;

	@RequestMapping(value = "/consumer/dept/add")
	public boolean add (Dept dept) {
		return service.add(dept);
	}

	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get (@PathVariable("id") Long id) {
		return service.get(id);
	}

	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list () {
		return service.list();
	}
}
