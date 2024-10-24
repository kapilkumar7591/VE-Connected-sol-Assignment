package com.ECommerceAPI_Assignment.ECommerceAPI_Assignment.repositories;

import com.ECommerceAPI_Assignment.ECommerceAPI_Assignment.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}