package com.tang.dao;

import com.tang.bean.Department;

import java.util.List;

public interface DepartmentMapper {

    public Integer addDepart(Department department);

    public List<Department> selectAll();

}