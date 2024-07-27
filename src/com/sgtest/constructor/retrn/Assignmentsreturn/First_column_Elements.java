package com.sgtest.constructor.retrn.Assignmentsreturn;

// write a method for the given 3*3 2D integer array it should return 1St column of the elements
class Rtrn1stcolumn{
   int[] get1stcol(int arr[][]){
         int fstcol[]=new int[3];
         for(int i =0;i<3;i++){
             fstcol[i]=arr[i][0];
         }
         return fstcol;
   }
}
public class First_column_Elements {
    public static void main(String[] args) {
        Rtrn1stcolumn r1c =new Rtrn1stcolumn();
        int arr[][]= {{10,20,30,},
                     {20,30,40},
                     {25,65,87}};
       int[]fstcol= r1c.get1stcol(arr);
        for(int x : fstcol){
            System.out.println(x);
        }

    }
}
