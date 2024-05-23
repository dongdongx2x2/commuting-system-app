package com.group.commutingsystemapp.dto;

public class EmployeeDTO {
    private String name;
    private String teamName;
    private String role;
    private String birthday;
    private String workStartDate;

    public EmployeeDTO(String name, String teamName, String role, String birthday, String workStartDate) {
        this.name = name;
        this.teamName = teamName;
        this.role = role;
        this.birthday = birthday;
        this.workStartDate = workStartDate;
    }

    public String getName() {
        return name;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getRole() {
        return role;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getWorkStartDate() {
        return workStartDate;
    }
}
