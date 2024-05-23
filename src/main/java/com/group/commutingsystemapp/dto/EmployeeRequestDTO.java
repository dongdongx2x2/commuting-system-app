package com.group.commutingsystemapp.dto;

import com.group.commutingsystemapp.domain.employee.Employee;
import com.group.commutingsystemapp.domain.team.Team;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

public class EmployeeRequestDTO {

    @NotBlank(message = "직원 이름은 null 또는 공백일 수 없습니다.")
    private String name;

    @NotNull(message = "매니저 여부는 null일 수 없습니다.")
    private Boolean isManager;

    @NotNull(message = "입사일은 null일 수 없습니다.")
    private LocalDate workStartDate;

    @NotNull(message = "생일은 null일 수 없습니다.")
    private LocalDate birthday;

    @NotNull(message = "팀 ID는 null일 수 없습니다.")
    private Long teamId;

    public String getName() {
        return name;
    }

    public Boolean getIsManager() {
        return isManager;
    }

    public LocalDate getWorkStartDate() {
        return workStartDate;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public Long getTeamId() {
        return teamId;
    }

    public Employee toEmployee(Team team) {
        return new Employee(name, isManager, workStartDate, birthday, team);
    }
}
