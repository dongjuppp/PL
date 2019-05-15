package great;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import student.Student;
import student.StudentDemo;

public class GreatDemo {
	static ArrayList<Student> stList = new ArrayList<>();
	/*
	public static void main(String[] args) {
		StudentDemo demo = new StudentDemo();

		demo.doit();
	}
	*/
	void doit() {
		readFile("input/students.txt");
		printAll();
	}
	void readFile(String filename) {
		Student st = null;
		Scanner fs = openFile(filename);
		while (fs.hasNext()) {
			st = new Student();
			st.read(fs);
			if (stList.contains(st))
				continue;
			stList.add(st);
		}
		fs.close();
	}
	void printAll() {
		for (Student st : stList)
			st.print();
	}
	private Scanner openFile(String filename) {
	    Scanner scan = null;
	    try{
	    	scan = new Scanner(new File(filename));
	    } catch(FileNotFoundException e){
	    	throw new RuntimeException(e);
	    }
	    return scan;
	}
}
