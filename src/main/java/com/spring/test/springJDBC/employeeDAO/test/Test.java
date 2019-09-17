package com.spring.test.springJDBC.employeeDAO.test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.test.springJDBC.employee.pojo.Employee;
import com.spring.test.springJDBC.employeeDAO.impl.EmployeeDAOImpl;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/test/springJDBC/employeeDAO/test/config.xml");
		EmployeeDAOImpl dao = (EmployeeDAOImpl) context.getBean("employeeDAO");
		Employee employee = new Employee();
//		employee.setUser_name("Akshay");
//		employee.setUser_contact("8732112054");
//		int result = dao.create(employee);
		
//		Employee employee = dao.read(2);
//		
//		List<Employee> allEmployee = dao.getAllEmployee();
//		for (Employee emp : allEmployee) {
//			
//			System.out.println(emp);
//		}
//		System.out.println("Employee Records :"+employee);
		
		
		employee.setUser_id(2);
		employee.setUser_name("Sameer");
		int result = dao.updateEmployee(employee);
		System.out.println("Record updated "+result);
		
	}
}
