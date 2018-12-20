package com.tang;

import com.tang.bean.Department;
import com.tang.bean.Employee;
import com.tang.dao.DepartmentMapper;
import com.tang.dao.EmployeeMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SsmCrudApplicationTests {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    public void contextLoads() throws SQLException {

//        TestDao testDao = applicationContext.getBean(TestDao.class);
//
//        int n = testDao.addF("tang1");
//
//        System.out.println(n);

//        DepartmentMapper departmentMapper = applicationContext.getBean(DepartmentMapper.class);
//
//        departmentMapper.addDepart(new Department(1,"技术部"));

//        EmployeeMapper employeeMapper = applicationContext.getBean(EmployeeMapper.class);

//        employeeMapper.addEmployee(new Employee(1,"tang","1","2684270465@qqq.com",1));
//
//        List<Employee> employees = employeeMapper.selectAll();
//
//        for(Employee employee : employees){
//            System.out.println(employee);
//        }

//        Object source = applicationContext.getBean("dataSource");
//        System.out.println(source);
//
//
//        System.out.println(Arrays.toString(applicationContext.getBeanDefinitionNames()));

    }

}
