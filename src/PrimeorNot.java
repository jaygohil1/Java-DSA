
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class PrimeorNot {

    public static void main(String[] args) {
        int num;
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();

        int c=2;
       int  sqrtnum= (int) sqrt(num);
       boolean prime =true;

        while(c<=sqrtnum) {
            if (num % c == 0)
            {
                prime=false;
                break;
            }
            c = c+1;
        }
        if(prime==true){
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not Prime Number");
        }
    }
}
