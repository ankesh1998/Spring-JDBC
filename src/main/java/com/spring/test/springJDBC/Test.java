package com.spring.test.springJDBC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/test/springJDBC/config.xml");
		JdbcTemplate jdbcTemplate = (JdbcTemplate) context.getBean("jdbcTemplate");
		
		int result = jdbcTemplate.update("insert into user (user_name,user_contact) values (?,?)", "Ankesh Pandey", "8318251190");
		System.out.println(result+" record Inserted");
		
	}
}
