package com.syh.springcloud.entities;

public class Dept {
    // 主键
    private Long 	deptno;
    // 部门名称
    private String 	dname;
    // 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
    private String 	db_source;
    //是否正常查询到数据
    private Boolean normal;
    // 描述信息
    private String description;

    public Dept() {
    }

    public Dept(Long deptno, String dname, String db_source, Boolean normal, String description) {
        this.deptno = deptno;
        this.dname = dname;
        this.db_source = db_source;
        this.normal = normal;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getNormal() {
        return normal;
    }

    public void setNormal(Boolean normal) {
        this.normal = normal;
    }

    public Long getDeptno() {
        return deptno;
    }

    public void setDeptno(Long deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public String getDb_source() {
        return db_source;
    }

    public void setDb_source(String db_source) {
        this.db_source = db_source;
    }
}
