package com.flp.ems.view;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

import com.flp.ems.domain.Department;
import com.flp.ems.domain.Role;
import com.flp.ems.service.EmployeeServiceImpl;
import com.flp.ems.util.Validate;

public class UserInteraction {
	BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
	EmployeeServiceImpl ESI = new EmployeeServiceImpl();
	
	void AddEmployee() throws IOException {

		HashMap<String, String> hm = new HashMap<String, String>();

		System.out.println("Enter Name:");
		do {
			String Name = ob.readLine();
			if (Validate.ValidateName()) {
				hm.put("Name", Name);
			}

			else {
				System.out.println("Please Enter a Valid name:");

			}
		} while (!Validate.ValidateName());

		System.out.println("Enter Mobile:");
		do {
			String Mobile = ob.readLine();
			if (Validate.ValidatePhone_no()) {
				hm.put("Mobile", Mobile);
			}

			else {
				System.out.println("Please Enter a Valid Number:");
			}
		} while (!Validate.ValidatePhone_no());

		System.out.println("Enter Address:");
		String Address = ob.readLine();
		hm.put("Address", Address);

		System.out.println("Enter Date of Birth:");
		do {
			String DOB = ob.readLine();
			if (Validate.Validatedate()) {
				hm.put("DOB", DOB);
			} else {
				System.out.println("Please Enter a Valid Date:");
			}
		} while (!Validate.Validatedate());

		System.out.println("Enter Date of Joining:");
		do {
			String DOJ = ob.readLine();
			if (Validate.Validatedate()) {
				hm.put("DOJ", DOJ);
			} else {
				System.out.println("Please Enter a Valid Date:");
			}
		} while (!Validate.Validatedate());

		ArrayList<String> dept = new ArrayList<String>();
		dept = Department.getDepartment();
		System.out.println("Select a Department");
		int counter = 0;
		for (String s : dept) {
			counter++;
			System.out.println(counter + ". " + s);
		}

		int ch = Integer.parseInt(ob.readLine());
		while (true) {
			if (ch < 1 || ch > dept.size()) {
				System.out.println("Please Enter a valid input");
				ch = Integer.parseInt(ob.readLine());
			} else {
				hm.put("Department", dept.get(--ch));
				break;
			}
		}

		ArrayList<String> role = new ArrayList<String>();
		role = Role.getRole();
		System.out.println("Select a Role");
		counter = 0;
		for (String s1 : role) {
			counter++;
			System.out.println(counter + ". " + s1);
		}

		ch = Integer.parseInt(ob.readLine());
		while (true) {
			if (ch < 1 || ch > role.size()) {
				System.out.println("Please Enter a valid input");
				ch = Integer.parseInt(ob.readLine());
			} else {
				hm.put("Role", role.get(--ch));
				break;
			}
		}
		
		
		ESI.AddEmployee(hm);

	}

	void ModifyEmployee() {

	}

	void RemoveEmployee() {

	}

	void SearchEmployee() {

	}

	void getAllEmployee() {

	}
}
