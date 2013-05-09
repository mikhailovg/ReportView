package ru.digdes.ReportView.model.entities;

public class Report {

    private Long report_id;
    private Long p_id;
    private String name;

    public Report(){
    }

    public void setReport_id(Long report_id) {
        this.report_id = report_id;
    }
    public Long getReport_id() {
        return report_id;
    }

    public void setP_id(Long p_id) {
        this.p_id = p_id;
    }
    public Long getP_id() {
        return p_id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
