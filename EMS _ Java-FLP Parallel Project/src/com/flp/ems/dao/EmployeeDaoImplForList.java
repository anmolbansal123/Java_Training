package com.flp.ems.dao;

import java.util.ArrayList;

import com.flp.ems.domain.Employee;

public class EmployeeDaoImplForList implements IemployeeDao {

	ArrayList<Employee> emp = new ArrayList<Employee>();

	@Override
	public void AddEmployee(Employee e) {
		// TODO Auto-generated method stub
		if (emp.add(e)) {
			System.out.println("Employee Added Successfuly");
			System.out.println();
		} else {
			System.out.println("Employee Was Not Added");
			System.out.println();
		}

	}

	@Override
	public void ModifyEmployee(Employee e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void RemoveEmployee(String kin_id) {
		// TODO Auto-generated method stub
		for (Employee e : emp)
		{
			if((e.getKin_id()).equals(kin_id)){
				
				if(emp.remove(e)){
					System.out.println("Employee Removed Successfully");
				}
				else{
					System.out.println("Employee Not Removed");
				}
				break;
			}
		}

	}

	@Override
	public Employee SearchEmployee(String kin_id) {
		// TODO Auto-generated method stub
		for (Employee e : emp) {
			if ((e.getKin_id()).equals(kin_id) ) {
				return e;
			}
			
		}
			return null;
	}

	@Override
	public ArrayList<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return emp;
	}

}
