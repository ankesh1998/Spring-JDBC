package com.spring.test.springJDBC.employeeDAO.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.spring.test.springJDBC.employee.DAO.EmployeeDAO;
import com.spring.test.springJDBC.employee.DAO.rowmapper.EmployeeRowMapper;
import com.spring.test.springJDBC.employee.pojo.Employee;

@Component("employeeDAO")
public class EmployeeDAOImpl implements EmployeeDAO {

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public int create(Employee employee) {
		int result = jdbcTemplate.update("INSERT into user (user_name,user_contact)VALUES (?,?)", employee.getUser_name(),
				employee.getUser_contact());
		return result;
	}

	@Override
	public Employee read(int id) {
		String sql = "Select * from user where user_id=?";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		Employee employee = jdbcTemplate.queryForObject(sql , rowMapper, id);
		return employee;
	}

	@Override
	public List<Employee> getAllEmployee() {
		String sql = "Select * from user";
		EmployeeRowMapper rowMapper = new EmployeeRowMapper();
		List<Employee> result = jdbcTemplate.query(sql, rowMapper);
		return result;
	}

	@Override
	public int updateEmployee(Employee employee) {
	int result = jdbcTemplate.update("update user set user_name=? where user_id=?",employee.getUser_name(),employee.getUser_id());
	return result;
	}



}
