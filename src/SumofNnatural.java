import java.util.Scanner;

//Given a positive integer n, find the sum of the first n natural numbers.
public class SumofNnatural {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number n: ");
        int usernum = in.nextInt();

        int ans = sumOfN(usernum);
        System.out.println(ans);

    }




    static int sumOfN(int num){
        int sum = 0;
        for (int i = 1; i <=num ; i++) {
            sum+=i;
        }
        System.out.println("The sum of the n natural numbers is: ");
        return sum;
    }
}
