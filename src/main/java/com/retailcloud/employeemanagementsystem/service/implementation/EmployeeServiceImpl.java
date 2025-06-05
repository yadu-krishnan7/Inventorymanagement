package com.retailcloud.employeemanagementsystem.service.implementation;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.retailcloud.employeemanagementsystem.dto.EmployeeDTO;
import com.retailcloud.employeemanagementsystem.entity.Department;
import com.retailcloud.employeemanagementsystem.entity.Employee;
import com.retailcloud.employeemanagementsystem.repository.DepartmentRepository;
import com.retailcloud.employeemanagementsystem.repository.EmployeeRepository;
import com.retailcloud.employeemanagementsystem.service.EmployeeService;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{


    private final EmployeeRepository employeeRepository;

    private final DepartmentRepository departmentRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository,DepartmentRepository departmentRepository) {
        this.employeeRepository = employeeRepository;
        this.departmentRepository = departmentRepository;
    }
    @Override
    public EmployeeDTO createEmployee(EmployeeDTO dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'createEmployee'");
    }

    @Override
    public EmployeeDTO updateEmployee(Long id, EmployeeDTO dto) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateEmployee'");
    }

    @Override
    public EmployeeDTO updateEmployeeDepartment(Long id, Long deptId) {
         Employee emp = employeeRepository.findById(id).orElseThrow();
        Department dept = departmentRepository.findById(deptId).orElseThrow();
        emp.setDepartment(dept);
        return toDTO(employeeRepository.save(emp));
    }

    @Override
    public Page<EmployeeDTO> getAllEmployees(Pageable pageable) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllEmployees'");
    }

    @Override
    public List<EmployeeDTO> getEmployeeNameAndIdList() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getEmployeeNameAndIdList'");
    }
    
}
