package ru.digdes.ReportView.model.entities;

import java.util.Date;

public class User {
    private Long user_id;
    private String fio;
    private Date bd;
    private String email;
    private Long role_id;

    public User(){
    }

    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
    public Long getUser_id() {
        return user_id;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }
    public String getFio() {
        return fio;
    }

    public void setBd(Date bd) {
        this.bd = bd;
    }
    public Date getBd() {
        return bd;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

    public void setRole_id(Long role_id) {
        this.role_id = role_id;
    }
    public Long getRole_id() {
        return role_id;
    }
}
