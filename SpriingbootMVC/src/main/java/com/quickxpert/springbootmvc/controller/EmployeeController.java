package com.quickxpert.springbootmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.quickxpert.springbootmvc.model.Employee;
import com.quickxpert.springbootmvc.service.EmployeeService;

@Controller
public class EmployeeController 
{
     @Autowired
     private EmployeeService employeeService;
     
     @GetMapping("/home")
     public String viewHomePage (Model model)
     {  
    	 model.addAttribute("listEmployees",employeeService.getAllEmployee());
		return "index";
    	 
     }
     
     @GetMapping("/showNewEmployeeForm")
     public String showNewEmployeeForm (Model model)
     {
    	 Employee employee=new Employee();
    	 model.addAttribute("employee",employee);
    	 return "addEmployee";
     }
     
     @PostMapping("/saveEmployee")
     public String saveEmployee(@ModelAttribute ("employee") Employee employee)
     {  
    	employeeService.saveEmployee(employee);
		return "redirect:/home";
    	 
     }
     
     @GetMapping("/showFormForUpdate/{id}")
     public String showFormForUpdate(@PathVariable(value="id") int id, Model model)
     {
    	 Employee employee=employeeService.getEmployeeById(id);
    	 model.addAttribute("employee",employee);
    	 return "updateEmployee";
     }
     
     @GetMapping("/deleteEmployee/{id}")
     public String deleteEmployee(@PathVariable(value="id") int id)
     {
    	 employeeService.deleteEmployeeById(id);
    	 return "redirect:/home";
     }
     
     
}
