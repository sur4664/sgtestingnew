package com.sgtest.constructor.retrn.Assignmentsreturn;
// wa method which return odd num from 10 to 1
class Rtr10_1{
   int[] rtodd(int arr[]){
       int b[]=new int[arr.length];
       int k =0;
       for(int i=0;i<=arr.length;i++){
           b[k]=arr[i];
           k++;
       }
       return b;
   }
}
public class Odd_rtrn_10_20 {
    public static void main(String[] args) {
        Rtr10_1 o = new Rtr10_1();
        int a[]={9,7,5,3,1};
        int z[]=o.rtodd(a);
        for (int x:z){
            System.out.println(x);
        }
    }
}





