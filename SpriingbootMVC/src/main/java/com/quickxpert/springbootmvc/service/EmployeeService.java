package com.quickxpert.springbootmvc.service;

import java.util.List;

import com.quickxpert.springbootmvc.model.Employee;

public interface EmployeeService 
{
     List<Employee>getAllEmployee();
     void saveEmployee(Employee employee);
     Employee getEmployeeById(int id);
     void deleteEmployeeById(int id);
}
