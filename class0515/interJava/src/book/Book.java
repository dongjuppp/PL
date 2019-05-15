package book;
import java.util.Arrays;
import java.util.Scanner;
/*
열혈강의 객체 지향 자바
1234 2010 프리렉
1 강요한
 */
public class Book {
	static int Number=1;
	int id;
	String title;
	int isbn;
	int year;
	String publisher;
	String[] authors;
	void read(Scanner in) {
		id = Number++;
		title = in.next();
		isbn = in.nextInt();
		year = in.nextInt();
		publisher = in.next();
		int n = in.nextInt();
		authors = new String[n];
		for (int i=0; i < n; i++)
			authors[i] = in.next();
	}
		
	void print() {
		System.out.printf("[%d] %s\n\t%d %d년 %s - ", 
				id, title, isbn, year, publisher);
		for (String a : authors)
			System.out.printf("%s ", a); 
		System.out.println();
	}
	boolean compare(String kwd) {
		if (kwd.matches("-?\\d+")) {
			int temp = Integer.parseInt(kwd);
			if (id == temp) return true;
			if (isbn == temp) return true;
			if (year == temp) return true;
		}
		if (title.contains(kwd) || kwd.equals(publisher) 
			|| Arrays.binarySearch(authors, kwd) != -1)
			return true;
		return false;
	}
}