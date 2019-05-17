﻿package great;

import java.util.Scanner;

public class Great {
	static int Number=1;
	int id;
	String name;
	String gender;
	int bYear, dYear;
	String achieved;
	void read(Scanner in) {
		id = Number++;
		name = in.next();
		gender = in.next();
		bYear = in.nextInt();
		dYear = in.nextInt();
		achieved = in.nextLine();
	}
		
	void print() {
		System.out.printf("[%d] %s %d-%d, %s%n", 
				id, name, bYear, dYear, achieved);
	}
	boolean compare(String kwd) {
		if (kwd.matches("-?\\d+")) {
			int temp = Integer.parseInt(kwd);
			if (id == temp) return true;
			if (bYear <= temp && temp <= dYear) 
				return true;
		}
		if (kwd.equals(name) || achieved.contains(kwd))
			return true;
		return false;
	}
}