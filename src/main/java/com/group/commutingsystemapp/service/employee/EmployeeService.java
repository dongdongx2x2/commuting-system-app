package com.group.commutingsystemapp.service.employee;

import com.group.commutingsystemapp.domain.employee.Employee;
import com.group.commutingsystemapp.domain.employee.EmployeeRepository;
import com.group.commutingsystemapp.domain.team.Team;
import com.group.commutingsystemapp.domain.team.TeamRepository;
import com.group.commutingsystemapp.dto.EmployeeDTO;
import com.group.commutingsystemapp.dto.EmployeeRequestDTO;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private TeamRepository teamRepository;

    public Employee saveEmployee(EmployeeRequestDTO request) {
        Team team = teamRepository.findById(request.getTeamId())
                .orElseThrow(() -> new RuntimeException("Team not found"));

        Employee employee = request.toEmployee(team);
        return employeeRepository.save(employee);
    }

    public List<EmployeeDTO> getALlEmployees() {
        return employeeRepository.findAll().stream()
                .map(employee -> new EmployeeDTO(
                        employee.getName(),
                        employee.getTeam() != null ? employee.getTeam().getName() : null,
                        employee.isManager() ? "MANAGER" : "MEMBER",
                        employee.getBirthday().toString(),
                        employee.getWorkStartDate().toString()
                ))
                .collect(Collectors.toList());
    }
}
