package com.sgtest.constructor.retrn;
//case2
// note this operator can be used multiple times at variable level and class level and method level
// whereas at constructor level it has to be used in beginning of the 1st line and only once
class Calculate2{
    int add1(int x,int y){
        int res=x+y;
        return res;
    }
    int sub2(int a,int b){
       return (a-b);
    }
    void multiplication(){
        int p =this.add1(20,40);
        int q =this.sub2(10,20);
        int res =(p*q);
        System.out.println("multiplication is :"+ res);
    }
}
public class CalculationDemo2 {
    public static void main(String[] args) {
        Calculate2 o = new Calculate2();
        o.multiplication();
    }
}
