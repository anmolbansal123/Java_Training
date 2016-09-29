package com.flp.ems.domain;

public class Employee {
	private String Name;
	private String kin_id;
	private String email_id;
	private String phone_no;
	private String address;
	private String DOB;
	private String DOJ;
	private String Department;
	private String Role;
	private String Project;
	private static int id = 1000;

	@Override
	public boolean equals(Object o) {
		if (this.kin_id == ((Employee) o).kin_id
				&& this.email_id == ((Employee) o).email_id) {
			return true;
		} else {
			return false;
		}
	}

	public Employee(String name, String phone_no, String address, String dOB,
			String dOJ, String department, String role, String project) {
		id++;
		Name = name;
		this.phone_no = phone_no;
		this.address = address;
		DOB = dOB;
		DOJ = dOJ;
		Department = department;
		Role = role;
		Project = project;
		kin_id = "" + id + "_" + name;
		email_id = name + DOB + "@barclaycard.co.uk";
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getKin_id() {
		return kin_id;
	}

	public void setKin_id(String kin_id) {
		this.kin_id = kin_id;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getPhone_no() {
		return phone_no;
	}

	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}

	public String getDOJ() {
		return DOJ;
	}

	public void setDOJ(String dOJ) {
		DOJ = dOJ;
	}

	public String getDepartment() {
		return Department;
	}

	public void setDepartment(String department) {
		Department = department;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public String getProject() {
		return Project;
	}

	public void setProject(String project) {
		Project = project;
	}

}
