package Meth_ods;

public class Swap {
    public static void main(String[] args) {
        int a,b;
        a=6;
        b=7;
        System.out.println("Before calling method swap: "+a+" "+b);
        swap(a,b);
        System.out.println(a+" "+b);
    }


    static void swap(int a,int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("Values after swap: "+a+" "+b);

    }

}
