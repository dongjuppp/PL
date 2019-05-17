package book;


import manage.Manager;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BookDemo extends Manager<Book> {

    public void readFile(String filename){

        Book temp=null;
        Scanner fs = openFile(filename);
        fs.nextLine();
        while(fs.hasNext()){
            temp=new Book();
            temp.read(fs);

            if(list.contains(temp))
                continue;
            list.add(temp);
        }

    }

}
