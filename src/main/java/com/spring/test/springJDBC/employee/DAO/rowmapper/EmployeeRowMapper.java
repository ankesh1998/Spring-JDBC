package com.spring.test.springJDBC.employee.DAO.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.test.springJDBC.employee.pojo.Employee;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setUser_id(rs.getInt(1));
		emp.setUser_name(rs.getString(2));
		emp.setUser_contact(rs.getString(3));
		
		return emp;
	}

}
