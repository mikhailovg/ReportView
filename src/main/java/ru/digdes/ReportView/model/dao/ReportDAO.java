package ru.digdes.ReportView.model.dao;

import ru.digdes.ReportView.model.entities.Report;
import java.util.*;
import java.sql.*;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

public class ReportDAO {
	
	private JdbcTemplate jdbcTemplate;
	 
	public void setDataSource(DataSource dataSource) {
		jdbcTemplate = new JdbcTemplate(dataSource);
	}
	
	public void addReport(Long p_id, String name) throws SQLException{
		String sql = "INSERT INTO REPORTS(`P_ID`,`NAME`) VALUES(?,?)";
		jdbcTemplate.update(sql, new Object[]{p_id,name});
	}	 
	 
	public Report getReportById(Long report_id) throws SQLException {
		String sql = "SELECT * FROM REPORTS WHERE REPORT_ID=?";
		return (Report)jdbcTemplate.queryForObject(sql,new Object[]{report_id},new BeanPropertyRowMapper(Report.class));
	}
	 
	public List<Report> getAllReports() throws SQLException {
		 String sql = "SELECT * FROM REPORTS";
			List<Report> reports = new ArrayList<Report>();
			List<Map<String,Object>> rows = jdbcTemplate.queryForList(sql);
			for (Map row : rows) 
			{
				Report report= new Report();
				report.setReport_id((Long)(row.get("report_id")));
				report.setP_id((Long)(row.get("p_id")));
				report.setName((String)row.get("name"));
				reports.add(report);
			}
	 
			return reports;
		  }
	 
	public void deleteReport(String name) throws SQLException {
		String sql="DELETE FROM REPORTS WHERE NAME=?";
		jdbcTemplate.update(sql,new Object[]{name});
		}
	 
}
