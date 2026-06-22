import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;


        while (true) {
            System.out.println("Enter your operator :");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter the first number :");
                int num1 = input.nextInt();
                System.out.print("Enter the second number :");
                int num2 = input.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 > 0) {
                        ans = num1 / num2;
                    }
                    if (op == '%') {
                        ans = num1 % num2;
                    }
                }
            }
            else if (op == 'x' || op == 'X') {break;}
            else {
                System.out.println("Invalid inputs bruvv!");
            }

            System.out.println("Your answer is :" + ans);
        }

    }
}
