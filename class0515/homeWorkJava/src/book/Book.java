package book;

import manage.Managable;

import java.util.Arrays;
import java.util.Scanner;

public class Book implements Managable {
    static int Number=1;
    int id;
    String title;
    int isbn;
    int year;
    String publisher;
    String[] authors;




    @Override
    public void read(Scanner in){
        id = Number++;
        title = in.nextLine();
        if (title.length() == 0)
            title = in.nextLine();
        isbn = in.nextInt();
        year = in.nextInt();
        publisher = in.next();
        int n = in.nextInt();
        authors = new String[n];
        for (int i=0; i < n; i++)
            authors[i] = in.next();

    }
    @Override
    public void print(){
        System.out.printf("[%d] %s\n\t%d %d년 %s - ",
                id, title, isbn, year, publisher);
        for (String a : authors)
            System.out.printf("%s ", a);
        System.out.println();

    }
    @Override
    public boolean compare(String kwd){
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
