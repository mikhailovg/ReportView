package ru.digdes.ReportView.model.entities;

public class Role {
    private Long role_id;
    private String name;

    public Role(){
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }
    public Long getRole_id() {
        return role_id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
