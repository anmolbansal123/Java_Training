package com.flp.ems.domain;

import java.util.ArrayList;
import com.flp.ems.util.File_Reader;

public class Role {

	static ArrayList<String> role = new ArrayList<String>();

	public static ArrayList<String> getRole() {
		File_Reader fr2 = new File_Reader();
		role = fr2.ReadFile("Roles.txt");
		return role;
	}

}