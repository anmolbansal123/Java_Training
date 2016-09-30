package com.flp.ems.service;
import java.util.HashMap;

public interface IEmployeeService {
	public void AddEmployee(HashMap<String,String> hm);

	public void ModifyEmployee(HashMap<String,String> hm);

	public void RemoveEmployee(HashMap<String,String> hm);

	public void SearchEmployee(HashMap<String,String> hm);

	public void getAllEmployee();
}
