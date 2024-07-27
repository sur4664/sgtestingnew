package com.sgtest.constructor.retrn.Assignmentsreturn;
// wa method  which has to return sum of all
// elements from the given 2D short array
class Addele{
    int add2Dshortele(short sht [][]){
           int r= sht.length;
           int c =sht[0].length;
           int sum =0;
           for(int i =0;i<=r-1;i++){
               for(int j=0;j<=c-1;j++){
                   sum+=sht[i][j];
               }
           }
           return sum;
     }
}
public class SumAllEle_2DArray {
    public static void main(String[] args) {
        Addele ads = new Addele();
        short sht[][] = {{2, 5},
                         {7, 9}};
        int value =ads.add2Dshortele(sht);
        System.out.println(value);



    }
}