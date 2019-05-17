package manage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager<T extends Managable> {
    public ArrayList<T> list = new ArrayList<>();



    public void doit(Scanner scanner){

        while(true){
            System.out.println("(1.전체출력 2.검색 3.종료...)");
            int num=scanner.nextInt();
            if(num==1){
                printAll();
            }
            else if(num==2){
                //scanner.next();
                String kwd=scanner.next();
                T s=find(kwd);
                s.print();
            }
            else
                break;
        }
    }
    public void readFile(String filename){

        T temp=null;
        Scanner fs = openFile(filename);
        fs.nextLine();
        while(fs.hasNext()){

            temp.read(fs);

            if(list.contains(temp))
                continue;
            list.add(temp);
        }

    }

    public Scanner openFile(String filename) {
        Scanner scan = null;
        try{
            scan = new Scanner(new File(filename));
        } catch(FileNotFoundException e){
            throw new RuntimeException(e);
        }
        return scan;
    }



    public void printAll(){
        for(T t:list){
            t.print();
        }
    }

    public T find(String kwd){
        T result=null;
        for(T t:list){
            if(t.compare(kwd)){
                result=t;
            }
        }
        return result;
    }
}
