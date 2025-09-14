package com.bharath.backendrestapiemp.service;

import com.bharath.backendrestapiemp.dto.EmployeeResponseDto;

import java.util.List;

public interface EmployeeService {
    List<EmployeeResponseDto> getAllEmployees();
    EmployeeResponseDto getEmployeeById(Long id);
    EmployeeResponseDto createEmployee(EmployeeResponseDto employeeDto);
    EmployeeResponseDto updateEmployee(Long id, EmployeeResponseDto employeeDto);
    void deleteEmployee(Long id);
}