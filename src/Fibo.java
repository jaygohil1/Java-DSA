import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
//        System.out.println("Enter a number to get fibonnaci series till that number: \n");
        System.out.println("Enter a number to get  that number: \n");
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int a = 0;
        int b = 1;
        int temp=0;
//        System.out.print(a+" "+b);

// Code for printing a series of n fibonacci numbers
//        for (int i = 2;i<num;i++)
//        {
//            temp = b;
//            b = b+a;
//            a= temp;
//            System.out.print(" "+b+" ");
//
//        }
//
        // TO print the Nth fibonacci number**

            for (int i = 2;i<num;i++)
        {
            temp = b;
            b = b+a;
            a= temp;

        }
            System.out.println("The Nth fibonacci number is :"+b);


    }
}
