import java.util.Scanner;

public class Num_Reversal {
    public static void main(String[] args) {
        System.out.println("Enter an integer to be reversed :");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
//        System.out.println("The number you entered is :"+num);
        int reversed_num = 0;
        int lastnum=0;
        while(num!=0)
        {
            lastnum = num % 10;
            reversed_num = reversed_num*10 + lastnum;
            num /= 10;

        }

        System.out.println(reversed_num);
    }
}
