package com.flp.ems.dao;

import java.util.ArrayList;

import com.flp.ems.domain.Employee;

public class EmployeeDaoImplForList implements IemployeeDao {

	ArrayList<Employee> emp = new ArrayList<Employee>();
	
	@Override
	public void AddEmployee(Employee e) {
		// TODO Auto-generated method stub
		if(emp.add(e)){
			System.out.println("Employee Added Successfuly");
			System.out.println();
		}
		else{
			System.out.println("Employee Was Not Added");
			System.out.println();
		}
	  
	}

	@Override
	public void ModifyEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RemoveEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void SearchEmployee(Employee e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getAllEmployee() {
		// TODO Auto-generated method stub
		
	}

}
