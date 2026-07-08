package Meth_ods;

public class FOverloading {
    //THis is function overloading! Number of args should be diff or the type of parameters should be diff namme can be same
    public static void main(String[] args) {
        func(9);
        func(2,4);
        func("jay");
        func(2,33,22);
    }
    static void func (int num){}
    static void func (int num,int b){}
    static void func (String name){}
    static void func(int c,int d,int f){}
}
