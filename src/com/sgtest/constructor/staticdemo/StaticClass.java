package com.sgtest.constructor.staticdemo;
class Maths{
   static String mathstype;
        static void addition(int x,int y){
            int res=(x+y);
            System.out.println("addition :"+res);
        }

}
public class StaticClass {
    public static void main(String[] args) {
        Maths.mathstype=" algebra";
        System.out.println("Maths type ;"+Maths.mathstype);
        Maths.addition(100,5);
    }
}
