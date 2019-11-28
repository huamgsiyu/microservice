package com.syh.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.syh.springcloud.entities.Dept;
import com.syh.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController
{
  @Autowired
  private DeptService service;

  @RequestMapping(value="/dept/add",method=RequestMethod.POST)
  @HystrixCommand(fallbackMethod = "hystrixAdd")
  public boolean add(@RequestBody Dept dept) {
    if(dept.getDname().length() == 0) {
      throw new RuntimeException("部门名称不能为空");
    }
    return service.add(dept);
  }
  public boolean hystrixAdd (Dept dept) {
    return false;
  }
  @RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
  @HystrixCommand(fallbackMethod = "hystrixGet")
  public Dept get(@PathVariable("id") Long id)
  {
    Dept dept = service.get(id);
    System.out.println("dept = " + dept);
    if (dept == null) {
      throw new RuntimeException("该id没有对应的记录");
    }
    return dept;
  }

  public Dept hystrixGet (@PathVariable("id") Long id) {
    Dept dept = new Dept();
    dept.setDeptno(id);
    dept.setNormal(false);
    dept.setDescription("该id没有对应的记录，请重新输入");
    return dept;
  }
  @RequestMapping(value="/dept/list",method=RequestMethod.GET)
  public List<Dept> list()
  {
    return service.list();
  }
}
 

