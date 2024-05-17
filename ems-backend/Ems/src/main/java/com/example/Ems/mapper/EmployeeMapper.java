package com.example.Ems.mapper;

import com.example.Ems.dto.EmployeeDto;
import com.example.Ems.entity.Employee;

public class EmployeeMapper {

    public static EmployeeDto mapToEmployeeDto(Employee employee){
      return new EmployeeDto(
              employee.getId(),
              employee.getFirstName(),
              employee.getLastName(),
              employee.getEmail()
      );
    }

    public static Employee mapToemployee(EmployeeDto employeeDto){
        return new Employee(
                employeeDto.getId(),
                employeeDto.getFirstName(),
                employeeDto.getLastName(),
                employeeDto.getEmail()
        );
    }
}
