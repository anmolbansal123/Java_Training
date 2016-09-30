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

	void ModifyEmployee() throws IOException {

		System.out.println("Enter kin_id for Employee whose info needs to be modified");
		String kin_id = ob.readLine();
		System.out.println("Enter number of fields That you want to change");
		int n = Integer.parseInt(ob.readLine());
		HashMap<String, String> hm = new HashMap<String, String>();

		for (int i = 1; i <= n; i++) {

			System.out.println("Choose From the Given Fields");
			System.out.println("1. Department");
			System.out.println("2. Role");
			System.out.println("3. Mobile");
			System.out.println("4. DOB");
			System.out.println("5. Address");

			int ch = Integer.parseInt(ob.readLine());

			switch (ch) {

			case 1:
				
				ArrayList<String> dept = new ArrayList<String>();
				dept = Department.getDepartment();
				System.out.println("Select a Department");
				int counter = 0;
				for (String s : dept) {
					counter++;
					System.out.println(counter + ". " + s);
				}

				int ch1 = Integer.parseInt(ob.readLine());
				while (true) {
					if (ch1< 1 || ch1 > dept.size()) {
						System.out.println("Please Enter a valid input");
						ch1 = Integer.parseInt(ob.readLine());
					} else {
						hm.put("Department", dept.get(--ch1));
						break;
					}
				}
				break;

			case 2:
				
				ArrayList<String> role = new ArrayList<String>();
				role = Role.getRole();
				System.out.println("Select a Role");
				counter = 0;
				for (String s1 : role) {
					counter++;
					System.out.println(counter + ". " + s1);
				}

				int ch2 = Integer.parseInt(ob.readLine());
				while (true) {
					if (ch2 < 1 || ch2 > role.size()) {
						System.out.println("Please Enter a valid input");
						ch2 = Integer.parseInt(ob.readLine());
					} else {
						hm.put("Role", role.get(--ch2));
						break;
					}
				}
				break;

			case 3:
				System.out.println("Enter Mobile Number");
				do {
					String Mobile = ob.readLine();
					if (Validate.ValidatePhone_no()) {
						hm.put("Mobile", Mobile);
					}

					else {
						System.out.println("Please Enter a Valid Number:");
					}
				} while (!Validate.ValidatePhone_no());

				break;

			case 4:
				System.out.println("Enter Date of Birth:");
				do {
					String DOB = ob.readLine();
					if (Validate.Validatedate()) {
						hm.put("DOB", DOB);
					} else {
						System.out.println("Please Enter a Valid Date:");
					}
				} while (!Validate.Validatedate());
				break;

			case 5:
				System.out.println("Enter Address:");
				String Address = ob.readLine();
				hm.put("Address", Address);

			}

		}
		
		

	}

	void RemoveEmployee() throws IOException {

		System.out.println("How would you like to proceed?");
		System.out.println("1. I know kin_id");
		System.out.println("2. I Don't know kin_id");
		HashMap<String, String> hm = new HashMap<String, String>();
		while (true) {
			int ch = Integer.parseInt(ob.readLine());
			if (ch == 1) {
				System.out.println("Enter kin_id");
				String kin_id = ob.readLine();
				hm.put("kin_id", kin_id);
				ESI.RemoveEmployee(hm);
				break;
			}

			else if (ch == 2) {
				ESI.getAllEmployee();
				System.out.println("Enter kin_id of Employee to be Removed");
				String kin_id = ob.readLine();
				hm.put("kin_id", kin_id);
				ESI.RemoveEmployee(hm);
				break;
			} else {
				System.out.println("Please enter a valid input");
			}
		}

	}

	void SearchEmployee() throws IOException {

		HashMap<String, String> hm = new HashMap<String, String>();
		System.out.println("Enter kin_id");
		String kin_id = ob.readLine();
		hm.put("kin_id", kin_id);
		System.out.println("Enter email_id");
		String email_id = ob.readLine();
		hm.put("email_id", email_id);

		ESI.SearchEmployee(hm);

	}

	void getAllEmployee() {
		ESI.getAllEmployee();
	}
}
