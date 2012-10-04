package com.orangeandbronze.springmvcdemo.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.orangeandbronze.springmvcdemo.domain.Employee;

@Repository("employeeDao")
public class EmployeeDaoImpl implements EmployeeDao {

//	public EmployeeDaoImpl(){
//		super(Employee.class);
//	}
	
	@Autowired
	private SessionFactory sessionFactory;

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}


	@Override
	public void add(Employee employee) {
		sessionFactory.getCurrentSession().save(employee);
	}

	@Override
	public void update(Employee employee) {
		sessionFactory.getCurrentSession().update(employee);
	}

	@Override
	public Employee get(Long id) {
		return (Employee) sessionFactory.getCurrentSession().get(Employee.class, id);
	}

	@Override
	public void delete(Employee employee) {
		sessionFactory.getCurrentSession().delete(employee);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getAll() {
		Criteria criteria = sessionFactory.getCurrentSession().createCriteria(Employee.class);
		return criteria.list();
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getByCriteria(String sqlQuery){
		Query query = sessionFactory.getCurrentSession().createQuery(sqlQuery);
		return query.list();
	}
	
	@Override
	public Employee getByEmployeeNo(Long employeeNo){
		String sqlQuery = "from Employee employee where employee.employeeNo = :employeeNo";
		Query query = getSessionFactory().getCurrentSession().createQuery(sqlQuery);
		query.setParameter("employeeNo", employeeNo);
		
		if(query.list().size() == 0){
			return new Employee();
		}
		else{
			return (Employee) query.list().get(0);
		}
	}
	
	@Override
	public Employee getByUsername(String username){
		String sqlQuery = "from Employee employee where employee.username = :username";
		Query query = getSessionFactory().getCurrentSession().createQuery(sqlQuery);
		query.setParameter("username", username);
		
		if(query.list().size() == 0){
			return null;
		}
		else{
			return (Employee) query.list().get(0);
		}
	}
	
}