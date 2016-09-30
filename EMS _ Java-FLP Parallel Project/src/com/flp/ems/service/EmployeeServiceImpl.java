package com.flp.ems.service;

import java.util.ArrayList;
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
		// String Project = hm.get("Name");

		Employee e = new Employee(name, phone_no, address, DOB, DOJ, Department, Role, "JAVA");

		EDI.AddEmployee(e);

	}

	@Override
	public void ModifyEmployee(HashMap<String, String> hm) {
		// TODO Auto-generated method stub

	}

	@Override
	public void RemoveEmployee(HashMap<String, String> hm) {
		// TODO Auto-generated method stub
		String kin_id = hm.get("kin_id");
		EDI.RemoveEmployee(kin_id);
	}

	@Override
	public HashMap<String, String> SearchEmployee(HashMap<String, String> hm) {
		// TODO Auto-generated method stub

		String kin_id = hm.get("kin_id");

		Employee e = EDI.SearchEmployee(kin_id);

		HashMap<String, String> hm1 = new HashMap<String, String>();

		if (e != null) {
			/*
			 * System.out.println("Employee Found"); System.out.println(
			 * "kin_id    Employee Name    Employee Department    Employee Role    email_id    MobileNumber"
			 * ); System.out.println(e.getKin_id() + " " + e.getName() + " " +
			 * e.getDepartment() + " " + e.getRole() + " " + e.getEmail_id() +
			 * " " + e.getPhone_no());
			 */
			hm1.put("flag", "true");
			hm1.put("kin_id", e.getKin_id());
			hm1.put("Name", e.getName());
			hm1.put("Department", e.getDepartment());
			hm1.put("Role", e.getRole());
			hm1.put("email_id", e.getEmail_id());
			hm1.put("Mobile", e.getPhone_no());
			return hm1;

		} else {
			// System.out.println("Employee Not Present in Directory");
			hm1.put("flag", "false");
			return hm1;
		}

	}

	@Override
	public void getAllEmployee() {
		// TODO Auto-generated method stub
		ArrayList<Employee> e = EDI.getAllEmployee();
		if (e.isEmpty()) {
			System.out.println("NO EMPLOYEE PRESENT");
		} else {
			System.out.println("kin_id   Name    Department     Role     Mobile");

			for (Employee e1 : e) {
				System.out.println(e1.getKin_id() + " " + e1.getName() + " " + e1.getDepartment() + " " + e1.getRole()
						+ " " + e1.getPhone_no());
			}
		}
	}

}
