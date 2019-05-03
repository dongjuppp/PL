import game.GameMgr;

import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        GameMgr gm = new GameMgr();
        gm.readText();
        while(true){
            gm.doit();
            System.out.println("재시작 y/n");
            String s=scan.next();
            if(s.charAt(0)=='n')
                break;
        }



    }
}
