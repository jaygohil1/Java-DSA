//Write a program to print the factorial of a number by defining a method named 'Factorial'.
// Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
//4! = 1 * 2 * 3 * 4 = 24

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();

        int ans = factorial(num);
        System.out.println("The factorial of the number is :"+ans);
    }

    static int factorial(int num) {
        int factans = 1;
        if (num == 0 || num == 1) {
            return 1;
        }

        for (int i = num; i > 0 ; i--) {

            factans *= i;
//        System.out.println(factans);
        }
        return factans;
    }

}
