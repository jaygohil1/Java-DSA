package Meth_ods;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        vargs(7, 5, 664, 435, 3, 55, 66, 22);
        multiple(4, 5, 5, 544, 55, 56, 6);


    }

    static void vargs(int... j) {
        System.out.println(Arrays.toString(j));
    }

    static void multiple(int a, int b, int... c) {
        // here the order of arguments matter alott c which is a variable argument should come last!

    }
}

