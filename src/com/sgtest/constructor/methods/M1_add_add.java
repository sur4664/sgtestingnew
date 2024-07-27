package com.sgtest.constructor.methods;
// write a method for the given 1D integer array perform addition of sum of
// first half number and sum of second half number
class  Sum{
    void add(int a[]){
        int sum=0;

        for(int i=0;i<=a.length/2;i++){

            sum = sum+a[i];
          //  System.out.println(sum);
        }

        int sum2=0;
        for(int i =a.length/2;i<=a.length-1;i++){
             sum2 =sum2+a[i];
          //  System.out.println(sum2);
        }


        int res = sum+sum2;
        System.out.println(res);
    }
}
public class M1_add_add {
    public static void main(String[] args) {
        int a[]={ 10,20,30,40,50,60,70,80};
        Sum s=new Sum();
        s.add(a);
    }
}
