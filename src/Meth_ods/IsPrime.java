package Meth_ods;

import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean ans  = prime(n);
        System.out.println(ans);


    }
    static boolean prime(int n){
        if(n<=1){
            return false;
        }
        int c = 2;
        while(c*c<=n){
            if (n%c == 0){
                return false;
            }
            c++;
        }
        return c * c > n;

    }
}
