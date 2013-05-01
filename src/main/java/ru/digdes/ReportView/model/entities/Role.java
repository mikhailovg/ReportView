package ru.digdes.ReportView.model.entities;

/**
 * Created with IntelliJ IDEA.
 * User: userg
 * Date: 30.04.13
 * Time: 10:51
 * To change this template use File | Settings | File Templates.
 */
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
