package com.group.commutingsystemapp.dto;

public class TeamDTO {
    private String name;
    private String manager;
    private int memberCount;

    public TeamDTO(String name, String manager, int memberCount) {
        this.name = name;
        this.manager = manager;
        this.memberCount = memberCount;
    }

    public String getName() {
        return name;
    }

    public String getManager() {
        return manager;
    }

    public int getMemberCount() {
        return memberCount;
    }
}
