package game;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class ComPlayer implements Iterable<String> {
    ArrayList<String> dict = new ArrayList<>();
    Scanner scan;
    private int cursor;

    int listSize;
    static int index=0;



    public Iterator<String> iterator(){
        return new WordChain();
    }

    class WordChain implements Iterator<String>{

        public boolean hasNext(){
            return cursor != listSize;

        }
        public String next(){
            int i=cursor;
            cursor+=1;
            return dict.get(i);
        }

    }
}
