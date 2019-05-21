package manage;

import book.Book;
import great.Great;
import student.Student;

public class Factory {

    public static Managable create(String identity){
        if(identity==null)
            return null;
        else if(identity.equalsIgnoreCase("Student")){
            return new Student();
        }
        else if(identity.equalsIgnoreCase("Book")){
            return new Book();
        }
        else{
            return new Great();
        }
    }
}
