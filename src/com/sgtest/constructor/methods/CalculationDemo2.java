package com.sgtest.constructor.methods;
// methods which are parameterized
// void is a key word which does not return any value
class Calculate2{
    void addition(int a, int b){
        int res= (a+b);
        System.out.println(res);
    }
    void multiplication(int x,int y){
        int res=(x*y);
        System.out.println(res);
    }
}


public class CalculationDemo2 {
    public static void main(String[] args) {
        Calculate2 c2 =new Calculate2();
        c2.addition(10,20);
        c2.multiplication(100,100);
        c2.addition(220,89087);
        c2.multiplication(10010,1878191);
    }
}
