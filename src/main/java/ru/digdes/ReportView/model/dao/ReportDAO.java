package ru.digdes.ReportView.model.dao;

import ru.digdes.ReportView.hibernate.util.HibernateUtil;
import ru.digdes.ReportView.model.entities.Report;
import java.util.Collection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import org.hibernate.Session;
import org.hibernate.Query;

public class ReportDAO {

	 public void addReport(Report report) throws SQLException{
		 Session session = null;
		    try {
		      session = HibernateUtil.getSessionFactory().openSession();
		      session.beginTransaction();
		      session.save(report);
		      session.getTransaction().commit();
		    } catch (Exception e) {
		      JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при вставке", JOptionPane.OK_OPTION);
		    } finally {
		      if (session != null && session.isOpen()) {

		        session.close();
		      }
		    }
	 }
	 
	 public void updateReport(Long report_id, Report report) throws SQLException {
		    Session session = null;
		    try {
		      session = HibernateUtil.getSessionFactory().openSession();
		      session.beginTransaction();
		      session.update(report);
		      session.getTransaction().commit();
		    } catch (Exception e) {
		      JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при вставке", JOptionPane.OK_OPTION);
		    } finally {
		      if (session != null && session.isOpen()) {
		        session.close();
		      }
		    }
		  }
	  
	 public Report getReportById(Long report_id) throws SQLException {
		    Session session = null;
		    Report report = null;
		    try {
		      session = HibernateUtil.getSessionFactory().openSession();
		      report = (Report) session.load(Report.class, report_id);
		    } catch (Exception e) {
		      JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'findById'", JOptionPane.OK_OPTION);
		    } finally {
		      if (session != null && session.isOpen()) {
		        session.close();
		      }
		    }
		    return report;
		  }
	 
	 public Collection getAllReports() throws SQLException {
		    Session session = null;
		    List reports = new ArrayList<Report>();
		    try {
		      session = HibernateUtil.getSessionFactory().openSession();
		      reports = session.createCriteria(Report.class).list();
		    } catch (Exception e) {
		      JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка 'getAll'", JOptionPane.OK_OPTION);
		    } finally {
		      if (session != null && session.isOpen()) {
		        session.close();
		      }
		    }
		    return reports;
		  }
	 
	 public void deleteReport(Report report) throws SQLException {
		    Session session = null;
		    try {
		      session = HibernateUtil.getSessionFactory().openSession();
		      session.beginTransaction();
		      session.delete(report);
		      session.getTransaction().commit();
		    } catch (Exception e) {
		      JOptionPane.showMessageDialog(null, e.getMessage(), "Ошибка при удалении", JOptionPane.OK_OPTION);
		    } finally {
		      if (session != null && session.isOpen()) {
		        session.close();
		      }
		    }
		  }
	
	 
	 
}
