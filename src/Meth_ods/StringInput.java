package Meth_ods;

import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter your name: ");
    String username = in.next();
    String storemsg = message(username);
        System.out.println(storemsg);


    }

    static String message(String user){
        String msg ="Hello, "+user;
        return msg;
    }


}
