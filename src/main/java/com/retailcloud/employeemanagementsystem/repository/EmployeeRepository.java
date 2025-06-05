package com.retailcloud.employeemanagementsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.retailcloud.employeemanagementsystem.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
    
}
