package main;

import java.util.Scanner;

public class Item {
    static int serialNo = 1;
    int id;
    String name;
    String type;
    int price;
    int order_num;

    void read(Scanner scan) {
        id = serialNo++;
        name = scan.next();
        price = scan.nextInt();
        type = scan.next();
    }

    void print() {
        String type = "Man";
        if (type.equals("f")) type = "Woman";
        else if (type.equals("c")) type = "Common";
        System.out.printf("[%d] %s %s ", id, name, type);
        System.out.print(price + "원\n");
    }
}
