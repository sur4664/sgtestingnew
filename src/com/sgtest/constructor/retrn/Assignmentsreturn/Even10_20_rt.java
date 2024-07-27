package com.sgtest.constructor.retrn.Assignmentsreturn;
//  wa method which has to  return even numbers from 10 to20
class Even10_20{
    int[] tentwenty(int arr[]){
        int b[]=new int [arr.length];
        int k=0;
        for(int i =0;i<arr.length;i++){
            b[k]=arr[i];
            k++;
        }
        return b;
    }
}
public class Even10_20_rt {
    public static void main(String[] args) {
        Even10_20 o = new Even10_20();
        int a[] = {10,12, 14, 16, 18, 20};
        int z[] = o.tentwenty(a);
        for (int val : z) {
            System.out.println(val);
        }


    }
}