package com.group.commutingsystemapp.service.employee;

import com.group.commutingsystemapp.domain.employee.Employee;
import com.group.commutingsystemapp.domain.employee.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }
}
