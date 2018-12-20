package com.tang.service;

import com.tang.bean.Employee;
import com.tang.bean.PageEmployee;
import com.tang.dao.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author ASUS
 * @create 2018-12-10 20:57
 */
@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;


    public Employee findById(String id){

        return employeeMapper.findById(id);

    }

    public int addEmployee(Employee employee){

        return employeeMapper.addEmployee(employee);

    }

    public PageEmployee pageSelectAll(Integer currentPage, Integer pageSize){

        PageEmployee pageEmployee = new PageEmployee(pageSize,currentPage);
//        总记录数
        int count = employeeMapper.employeeCount().intValue();
        pageEmployee.setCount(count);

//        总页数  10 4 11/3
        int countPage = (count + pageSize - 1) / pageSize;
        pageEmployee.setCountPage(countPage);

//        分页查询的起始位置
        int position = (pageEmployee.getCurrentPage() - 1) * pageSize;
        pageEmployee.setPosition(position);

        pageEmployee.setList(employeeMapper.pageSelectAll(pageEmployee));

        return pageEmployee;

    }

}
