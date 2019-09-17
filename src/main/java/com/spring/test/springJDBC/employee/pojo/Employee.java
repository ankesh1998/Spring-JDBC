package com.spring.test.springJDBC.employee.pojo;

public class Employee {

	private int user_id;
	private String user_name;
	private String user_contact;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getUser_contact() {
		return user_contact;
	}

	public void setUser_contact(String user_contact) {
		this.user_contact = user_contact;
	}

	@Override
	public String toString() {
		return "Employee [user_id=" + user_id + ", user_name=" + user_name + ", user_contact=" + user_contact + "]";
	}
}
