package com.sgtest.constructor.retrn;
// wa method which returns half of elements of the given array
class ElementsHalfofarray{
   int[] gethalf(int arr[]){
       int b[]=new int [arr.length/2];
       int k=0;
       for(int i =0;i<arr.length/2;i++){
           b[k]=arr[i];
           k++;
       }
       return b;
   }
}
public class HalfArray_return {
    public static void main(String[] args) {
        ElementsHalfofarray o = new ElementsHalfofarray();
        int a[]={10,20,30,40,50,60,70,80};
        int z[]=o.gethalf(a);
        for(int val :z){
            System.out.println(val);
        }



    }
}
