package com.flp.ems.view;

import java.io.*;

public class BootClass {

	public static void main(String[] args) throws IOException {
		System.out.println("WELCOME TO THE EMPLOYEE MANAGEMENT SYSTEM");
		System.out.println();
		menuSelection();
	}

	public static void menuSelection() throws IOException {
		BufferedReader ob = new BufferedReader(new InputStreamReader(System.in));
		UserInteraction ui = new UserInteraction();
		while (true) {
			System.out.println("Please choose from one of the options given below:");
			System.out.println();
			System.out.println("1. Add New Employee");
			System.out.println("2. Modify Existing Employee Details");
			System.out.println("3. Remove Employee");
			System.out.println("4. Search Employee");
			System.out.println("5. List All Employees");
			System.out.println("6. Exit");

			int ch = Integer.parseInt(ob.readLine());
			

			switch (ch) {
			case 1:
				ui.AddEmployee();
				break;

			case 2:
				ui.ModifyEmployee();
				break;

			case 3:
				ui.RemoveEmployee();
				break;

			case 4:
				ui.SearchEmployee();
				break;

			case 5:
				ui.getAllEmployee();
				break;

			case 6:
				System.exit(0);
				break;

			default:
				System.out.println("Input was not recognized, please enter a number only from the given choices");
				break;

			}
		}
	}
}