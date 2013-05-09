package ru.digdes.ReportView.model.service;

import ru.digdes.ReportView.model.dao.ReportDAO;
import ru.digdes.ReportView.model.entities.Report;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;
import java.util.List;
 
 
   
public class ReportService {

	 private ReportDAO reportDAO;
	 
	    @Autowired
	    public void setReportDAO(ReportDAO reportDAO) {
	        this.reportDAO = reportDAO;
	    }
	 
	    public void addReport(Long p_id, String name) throws SQLException {
	        reportDAO.addReport(p_id, name);
	    }
	    
	    public void deleteReport(String name) throws SQLException {
	        reportDAO.deleteReport(name);
	    }
	   
	    public Report getReportById(Long report_id) throws SQLException {
	        return reportDAO.getReportById(report_id);
	    }
	    
	    public List<Report> getAllReports() throws SQLException {
	        return reportDAO.getAllReports();
	    }
}
