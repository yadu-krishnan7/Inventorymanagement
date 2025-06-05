package com.retailcloud.employeemanagementsystem.service.implementation;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.retailcloud.employeemanagementsystem.dto.DepartmentDTO;
import com.retailcloud.employeemanagementsystem.repository.DepartmentRepository;
import com.retailcloud.employeemanagementsystem.service.DepartmentService;

public class DepartmentServiceImpl implements DepartmentService {

    private final DepartmentRepository departmentRepository; 

    public DepartmentServiceImpl(DepartmentRepository departmentRepository) {
        this.departmentRepository = departmentRepository;
    }

    @Override
    public DepartmentDTO addDepartment(DepartmentDTO dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'addDepartment'");
    }

    @Override
    public String deleteDepartment(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteDepartment'");
    }

    @Override
    public DepartmentDTO updateDepartment(Long id, DepartmentDTO dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateDepartment'");
    }

    @Override
    public Page<DepartmentDTO> getAllDepartments(Pageable pageable) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllDepartments'");
    }

    @Override
    public DepartmentDTO getDepartmentWithEmployees(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getDepartmentWithEmployees'");
    }

       
}
