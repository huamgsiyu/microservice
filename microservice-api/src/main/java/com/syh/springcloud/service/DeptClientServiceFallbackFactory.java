package com.syh.springcloud.service;

import com.syh.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable cause) {
        return new DeptClientService() {
            @Override
            public Dept get(long id)
            {
                Dept dept = new Dept();
                dept.setDeptno(id);
                dept.setNormal(false);
                dept.setDescription("该服务不可用，已被暂时降级");
                return dept;
            }

            @Override
            public List<Dept> list()
            {
                return null;
            }

            @Override
            public boolean add(Dept dept)
            {
                return false;
            }
        };
    }
}
