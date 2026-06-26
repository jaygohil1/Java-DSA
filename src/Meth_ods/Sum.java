package Meth_ods;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {

//        int answer = sum();
//        System.out.println(answer);
//        greet();

       int sum_answer = addition(8, 9);
        System.out.println(sum_answer);


    }

//Function basics
// [access modifier] [return type] [name] (arguments)
// {
//    --Code
//  }

    static int sum() {
        int num1, num2, ans;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number :");
        num1 = in.nextInt();
        System.out.println("Enter second number :");
        num2 = in.nextInt();
        ans = num1 + num2;
        return ans;
    }

    static String greet() {
        System.out.println("Bye wrld");
        return null;
    }

    //method with passing arguments!

    static int addition(int n1, int n2) {
        int ans = n1 + n2;
        return ans;
    }

}
