package com.group.commutingsystemapp.controller.employee;

import com.group.commutingsystemapp.domain.employee.Employee;
import com.group.commutingsystemapp.dto.EmployeeDTO;
import com.group.commutingsystemapp.dto.EmployeeRequestDTO;
import com.group.commutingsystemapp.service.employee.EmployeeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee createEmployee(@RequestBody EmployeeRequestDTO request) {
        return employeeService.saveEmployee(request);
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployees() {
        return employeeService.getALlEmployees();
    }
}