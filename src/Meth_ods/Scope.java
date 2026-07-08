package Meth_ods;

public class Scope {

    static void main(String[] args) {
        int a;

        {
             a = 9;
             int c = 999;
            System.out.println(a);
        }
        System.out.println(a);

        for (int i = 0; i < 5; i++) {
//            System.out.println(i);
            a = 45;
        }
        System.out.println(a);
    }
}
