package student;

import manage.Manager;


import java.util.Scanner;

public class StudentDemo extends Manager<Student> {

    public void readFile(String filename){

        Student temp=null;
        Scanner fs = openFile(filename);
        fs.nextLine();
        while(fs.hasNext()){
            temp=new Student();
            temp.read(fs);

            if(list.contains(temp))
                continue;
            list.add(temp);
        }

    }

}
