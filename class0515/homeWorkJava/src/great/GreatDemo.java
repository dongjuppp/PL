package great;

import manage.Manager;

import java.util.Scanner;

public class GreatDemo extends Manager<Great> {

    public void readFile(String filename){

        Great temp=null;
        Scanner fs = openFile(filename);
        fs.nextLine();
        while(fs.hasNext()){
            temp=new Great();
            temp.read(fs);

            if(list.contains(temp))
                continue;
            list.add(temp);
        }

    }






}
