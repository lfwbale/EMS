package com.example.controller;

import com.example.entity.Emp;
import com.example.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmpController {

    @Autowired
    private EmpService empService;

    //查询所有
    @GetMapping("/findAll")
    public String findAll(Model model){
        List<Emp> emps = empService.findAll();
        model.addAttribute("emps",emps);
        return "ems/emplist";
    }

    //保存员工信息
    @PostMapping("/save")
    public String save(Emp emp){
        empService.save(emp);
        return "redirect:/emp/findAll";
    }

    //删除员工
    @GetMapping("/delete")
    public String delete(String id){
        empService.delete(id);
        return "redirect:/emp/findAll";
    }

    //按id查询员工信息
    @GetMapping("/find")
    public String find(String id, Model model){
        Emp emp = empService.find(id);
        model.addAttribute("emp",emp);
        return "/ems/updateEmp";
    }

    //更新员工信息
    @PostMapping("/update")
    public String update(Emp emp){
        empService.update(emp);
        return "redirect:/emp/findAll";
    }


}
