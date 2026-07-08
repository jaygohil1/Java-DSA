public class Palindrome {
    public static void main(String[] args) {
        int num = 12321;
        int numcopy = num;
        int palinum = 0;

        while (numcopy!=0){
            palinum = (palinum*10) + (numcopy%10);
            numcopy/=10;
        }

        if (palinum == num){
            System.out.println("The number is palindrome");
            System.out.println(num);
            System.out.println(palinum);
        }
        else {
            System.out.println("the number is not palindrome!");
        }


    }
}
