package com.sgtest.constructor.retrn;
// case1
class Calculate1{
   int add(int x,int y){
       return(x+y);
   }
   int sub(int a,int b){
       return(a-b);
   }
   void multiplication(int i,int j){
       int res = i*j;
       System.out.println("multiplication :"+res);
   }
}
public class CalculationDemo1 {
    public static void main(String[] args) {
        Calculate1 obj =new Calculate1();
        // ist approach
       int val1= obj.add(10,20);
       int val2= obj.sub(15,20);
       obj.multiplication(val1,val2);
       //2nd approach
        obj.multiplication(obj.add(26,75),obj.sub(56,78));
    }
}
