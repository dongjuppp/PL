import book.BookDemo;
import great.GreatDemo;
import manage.Manager;
import student.StudentDemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Manager[] mgr = {new StudentDemo(),new BookDemo(), new GreatDemo()};
        Scanner scanner = new Scanner(System.in);
        mgr[0].readFile("students.txt");
        mgr[1].readFile("book.txt");
        mgr[2].readFile("great.txt");
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
