package com.flp.ems.service;

import java.util.HashMap;

import com.flp.ems.dao.EmployeeDaoImplForList;
import com.flp.ems.domain.Employee;

public class EmployeeServiceImpl implements IEmployeeService {
    EmployeeDaoImplForList EDI = new EmployeeDaoImplForList();
	@Override
	public void AddEmployee(HashMap<String, String> hm) {
		// TODO Auto-generated method stub
		
		String name = hm.get("Name");
		String phone_no = hm.get("Mobile");
		String address = hm.get("Address");
		String DOB = hm.get("DOB");
		String DOJ = hm.get("DOJ");
		String Department = hm.get("Department");
		String Role = hm.get("Role");
		//String Project = hm.get("Name");
		
		Employee e = new Employee(name,phone_no,address,DOB,DOJ,Department,Role,"JAVA");
		
		// Still have to code for Validation if the recors are duplicate or not
		
		EDI.AddEmployee(e);
		

	}

	@Override
	public void ModifyEmployee(HashMap<String, String> hm) {
		// TODO Auto-generated method stub

	}

	@Override
	public void RemoveEmployee(HashMap<String, String> hm) {
		// TODO Auto-generated method stub

	}

	@Override
	public void SearchEmployee(HashMap<String, String> hm) {
		// TODO Auto-generated method stub

	}

	@Override
	public void getAllEmployee(HashMap<String, String> hm) {
		// TODO Auto-generated method stub

	}

}
