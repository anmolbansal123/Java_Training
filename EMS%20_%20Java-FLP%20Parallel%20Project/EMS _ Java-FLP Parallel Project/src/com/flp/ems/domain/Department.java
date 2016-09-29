package com.flp.ems.domain;

import java.util.ArrayList;
import com.flp.ems.util.File_Reader;

public class Department {

	static ArrayList<String> dept = new ArrayList<String>();

	public static ArrayList<String> getDepartment() {
		File_Reader fr1 = new File_Reader();
		dept = fr1.ReadFile("Departments.txt");
		return dept;
	}

}
