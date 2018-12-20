package com.tang.Controller;

import com.tang.bean.Employee;
import com.tang.bean.PageEmployee;
import com.tang.bean.Result;
import com.tang.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * @author ASUS
 * @create 2018-12-11 21:16
 */
@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String index(){
        return "redirect:/emps";
    }

    @GetMapping("/emp/{id}")
    @ResponseBody
    public Employee getEmployee(@PathVariable("id") String id){

        Employee employee = employeeService.findById(id);

        return employee;
    }

    @DeleteMapping("/delEmps")
    @ResponseBody
    public Result delEmployee(@RequestParam(name = "delA[]") Integer[] delA){
//        System.out.println(request.get);



        return new Result("添加成功!", 1);
    }

    @PutMapping("/emp")
    @ResponseBody
    public Result addEmploy(Employee employee) throws IOException {

        int flage = employeeService.addEmployee(employee);

        Result result = new Result("添加成功!", 1);

        if (flage == 0){
            result.setMsg("添加失败!");
            result.setFlage(0);
        }
        return result;

    }

    @GetMapping("/emps")
    public String list(Model model,@RequestParam(value = "currentPage",defaultValue = "1") Integer currentPage,
                       @RequestParam(value = "pageSize",defaultValue = "5") Integer pageSize){

        PageEmployee pageEmployee = employeeService.pageSelectAll(currentPage,pageSize);

        model.addAttribute("pageEmployee",pageEmployee);

        return "list";
    }


}
