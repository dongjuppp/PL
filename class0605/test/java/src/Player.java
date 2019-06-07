import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Player implements Iterable<String> {
    ArrayList<String> dict = new ArrayList<>();
    ArrayList<String> used = new ArrayList<>();
    void readFile() {
        Scanner file = GameMgr.openFile("azkaban.txt");
        while (file.hasNext()) {
            String word = file.next();
            if (!word.matches("[a-z]+") ||
                    dict.contains(word) || word.length() < 3)
                continue;
            dict.add(word);
        }
        Collections.sort(dict);
    }
    String lastWord = null;
    boolean recieve(Scanner scan) {
        System.out.print(">> ");
        String inputWord = scan.next();
        if (lastWord != null) {
            if (!lastWord.endsWith(inputWord.substring(0,1))) {
                System.out.println("첫글자가 맞지 않습니다...");
                return false;
            } else if (used.contains(inputWord)) {
                System.out.println("이미 사용한 단어입니다...");
                return false;
            }
        }
        if (dict.contains(inputWord))
            dict.remove(inputWord);
        used.add(inputWord);
        lastWord = inputWord;
        return true;
    }
    class WordIterator implements Iterator<String> {
        @Override
        public boolean hasNext() {
            if (lastWord.equals("end"))
                return false;
            char ch = lastWord.charAt(lastWord.length()-1);
            for (String s : dict) {
                if (s.charAt(0) == ch)
                    return true;
                if (s.charAt(0) > ch)
                    break;
            }
            return false;
        }
        @Override
        public String next() {
            char ch = lastWord.charAt(lastWord.length()-1);
            for (String s : dict) {
                if (s.charAt(0) == ch) {
                    lastWord = s;
                }
            }
            dict.remove(lastWord);
            used.add(lastWord);
            return lastWord;
        }
    }
    @Override
    public Iterator<String> iterator() {
        // TODO Auto-generated method stub
        return new WordIterator();
    }
}
