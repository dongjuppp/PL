package game;

import java.io.File;
import java.util.HashMap;
import java.util.Scanner;

public class GameMgr {
    ComPlayer cp = new ComPlayer();
    Scanner scan;
    int i=0;

    HashMap<String,Boolean> userWord = new HashMap<>(); //사전에 등록안된 단어를 등록
    HashMap<String,Boolean> textWord = new HashMap<>(); //사전에 등록된 단어를 등록
    public void doit(){
        i=0;
        String string;
        char last,first=' ';
        scan=new Scanner(System.in);
        System.out.println("끝말잇기 게임을 시작합니다!");
        System.out.println("규칙 1: 소문자만입력(모든 단어는 소문자로 변환되어 저장했음)");
        System.out.println("규칙 2: 기호는 빼고 입력(모든 기호는 제거 하고 저장했음)");
        while(true){

            System.out.print(">>");
            string= scan.nextLine();
            if(string.charAt(0)!=first && i!=0){
                System.out.println("끝글자와 다릅니다");
                break;
            }

            //여기서 사전,유저 판단 후 중복여부
            if(textWord.containsKey(string)){ //사전에 등록
                if(!textWord.get(string)){
                    System.out.println("이미 사용된 단어를 사용했습니다!");
                    break;
                }
                textWord.replace(string,false);
            }
            else{
                if(userWord.containsKey(string)){
                    System.out.println("이미 사용된 단어를 사용했습니다");
                    break;
                }
                else{
                    userWord.put(string,true);
                }
            }

            last=string.charAt(string.length()-1);

            for(String s:cp){

                if(s.charAt(0)==last){
                    textWord.replace(s,false);
                    System.out.println(s);
                    first=s.charAt(s.length()-1);

                    break;
                }
                if(i==0) i++;

            }

        }
    }





    public void readText(){
        File file = new File("azkaban.txt");
        try{
            scan=new Scanner(file);
        }catch (Exception e){
            e.printStackTrace();
        }
        while(scan.hasNext()){
            String string = scan.next();
            //모든 단어들을 소문자화 하고 기호를 삭제
            string=string.toLowerCase();
            string=string.replaceAll("[,.!?']","");
            if(textWord.containsKey(string)){ //읽어들인 단어가 이미 존재 할때
                continue;
            }
            else{
                textWord.put(string,true);
                cp.dict.add(string);
            }
            cp.listSize=cp.dict.size();
        }
    }


}
