package com.flp.ems.dao;

import java.util.ArrayList;

import com.flp.ems.domain.Employee;

public interface IemployeeDao {
	public void AddEmployee(Employee e);

	public void ModifyEmployee(Employee e);

	public void RemoveEmployee(String kin_id);

	public Employee SearchEmployee(String kin_id,String email_id);

	public ArrayList<Employee> getAllEmployee();
}
