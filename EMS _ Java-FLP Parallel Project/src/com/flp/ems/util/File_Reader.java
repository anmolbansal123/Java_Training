package com.flp.ems.util;

import java.io.FileReader;
import java.util.ArrayList;

public class File_Reader {
	 ArrayList<String> arr = new ArrayList<String>();

	public  ArrayList<String> ReadFile(String file) {
		try {
			FileReader fr = new FileReader(file);
			char ar[] = new char[500];
			fr.read(ar);
			String a = "";
			for (char c : ar) {
				if (c != '\\') {
					a = a + c;
				} // prints the characters one by one
				else {
					arr.add(a);
					a = "";
				}
			}
			
			fr.close();
		}

		catch (Exception e) {
			e.printStackTrace();
		}

		return arr;
	}
}
