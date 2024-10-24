package com.ECommerceAPI_Assignment.ECommerceAPI_Assignment.service;

import com.ECommerceAPI_Assignment.ECommerceAPI_Assignment.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theEmployeesId);

    Employee save(Employee theEmployee);

    void deleteById(int theEmployeesId);

}