package ru.digdes.ReportView.model.entities;

import java.util.Date;

public class Stats {

	private Long stats_id;
    private Long user_id;
    private Long report_id;
    private Date view_date;
    private Long view_number;

    public Stats(){
    }

    public void setStats_id(Long stats_id) {
        this.stats_id = stats_id;
    }
    public Long getStats_id() {
        return stats_id;
    }
    
    public void setUser_id(Long user_id) {
        this.user_id = user_id;
    }
    public Long getUser_id() {
        return user_id;
    }

    public void setReport_id(Long report_id) {
        this.report_id = report_id;
    }
    public Long getReport_id() {
        return report_id;
    }

    public void setView_date(Date view_date) {
        this.view_date = view_date;
    }
    public Date getView_date() {
        return view_date;
    }

    public void setView_number(Long view_number) {
        this.view_number = view_number;
    }
    public Long getView_number() {
        return view_number;
    }
}
