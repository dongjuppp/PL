package student;

import manage.Managable;

import java.util.Scanner;

public class Student implements Managable {
    static int Number=1;
    int id;
    String s_id;
    String name;
    String dept;
    int year;
    String phone;


    public static Student create(){
        return new Student();
    }

    @Override
    public void read(Scanner in){
        id = in.nextInt();
        name = in.next();
        dept = in.next();
        year = in.nextInt();
        phone = in.next();

    }
    @Override
    public void print(){
        System.out.printf("%d %s %s %2d학년 %s%n",
                id, name, dept, year, phone);

    }
    @Override
    public boolean compare(String kwd){
        if (kwd.matches("-?\\d+")) {
            int temp = Integer.parseInt(kwd);
            if (id == temp) return true;
            if (year == temp) return true;
        }
        if (kwd.equals(name) || kwd.equals(dept)
                || kwd.equals(phone))
            return true;
        return false;
    }


}
