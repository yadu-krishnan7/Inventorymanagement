package com.retailcloud.employeemanagementsystem.mapper;

import com.retailcloud.employeemanagementsystem.dto.EmployeeDTO;
import com.retailcloud.employeemanagementsystem.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDTO toDTO(Employee e) {
        EmployeeDTO dto = new EmployeeDTO();
        dto.setId(e.getId());
        dto.setName(e.getName());
        dto.setDateOfBirth(e.getDateOfBirth());
        dto.setSalary(e.getSalary());
        dto.setAddress(e.getAddress());
        dto.setRole(e.getRole());
        dto.setJoiningDate(e.getJoiningDate());
        dto.setYearlyBonusPercentage(e.getYearlyBonusPercentage());
        if (e.getDepartment() != null) {
            dto.setDepartmentId(e.getDepartment().getId());
            dto.setDepartmentName(e.getDepartment().getName());
        }
        if (e.getReportingManager() != null) {
            dto.setReportingManagerId(e.getReportingManager().getId());
            dto.setReportingManagerName(e.getReportingManager().getName());
        }
        return dto;
    }
    
}
