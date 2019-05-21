import book.Book;
import great.Great;
import manage.Manager;
import student.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Manager[] mgr={new Manager<Student>(),new Manager<Book>(),new Manager<Great>()};
        Scanner scanner = new Scanner(System.in);
        mgr[0].readFile("students.txt","Student");
        mgr[1].readFile("book.txt","Book");
        mgr[2].readFile("great.txt","Great");
        while(true){
            System.out.println("1.학생 2.책 3.위인 4.종료...");
            int num=scanner.nextInt();
            if(num==1){
                mgr[0].doit(scanner);
            }
            else if(num==2){
                mgr[1].doit(scanner);
            }
            else if(num==3){
                mgr[2].doit(scanner);
            }
            else
                break;
        }
    }
}
