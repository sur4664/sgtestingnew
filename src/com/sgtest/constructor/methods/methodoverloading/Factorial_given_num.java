package com.sgtest.constructor.methods.methodoverloading;
// get factorial of a given number using recursion
class BasicMath2{
    int getfact_givennum(int num){
        if (num == 1) {
            return 1;
        }
        return num+getfact_givennum(num-1);
    }
}
public class Factorial_given_num {
    public static void main(String[] args) {
        BasicMath2 o1 = new BasicMath2();
        int v1=o1.getfact_givennum(4);
        System.out.println(v1);
       int v2= o1.getfact_givennum(5);
        System.out.println(v2);
    }
}
