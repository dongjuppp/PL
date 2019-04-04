package main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Main my = new Main();
        my.mymain();
    }
    Scanner scan = new Scanner(System.in);
    Item itemList[] = null;
    int nItems;
    void mymain() {
        System.out.print("상품 갯수 입력: ");
        nItems = scan.nextInt();
        itemList = new Item[nItems];
        for (int i = 0; i < nItems; i++) {
            itemList[i] = new Item();
            itemList[i].read(scan);
        }
        for (int i = 0; i < nItems; i++) {
            itemList[i].print();
        }
    }
}
