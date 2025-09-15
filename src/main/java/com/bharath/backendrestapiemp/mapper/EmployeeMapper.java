package com.bharath.backendrestapiemp.mapper;

import com.bharath.backendrestapiemp.dto.EmployeeResponseDto;
import com.bharath.backendrestapiemp.entity.Employee;

public class EmployeeMapper {

    // Helper methods for conversion
    public static EmployeeResponseDto mapToEmployeeDto(Employee employee) {
        return new EmployeeResponseDto(
                employee.getId(),
                employee.getFirstName(),
                employee.getLastName(),
                employee.getEmailId()
        );
    }

    public static Employee mapToEmployee(EmployeeResponseDto employeeResponseDto) {
        return new Employee(
                employeeResponseDto.getId(),
                employeeResponseDto.getFirstName(),
                employeeResponseDto.getLastName(),
                employeeResponseDto.getEmailId()
        );
    }
}