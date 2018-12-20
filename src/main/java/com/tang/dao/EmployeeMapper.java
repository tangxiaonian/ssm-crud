package com.tang.dao;

import com.tang.bean.Employee;
import com.tang.bean.PageEmployee;

import java.util.List;

public interface EmployeeMapper {

    public Employee findById(String id);

    public List<Employee> pageSelectAll(PageEmployee pageEmployee);

    public int deleteById(Integer id);

    public int addEmployee(Employee employee);

    public Long employeeCount();
}