package com.sgtest.constructor.retrn.Assignmentsreturn;
// wa method which return the result of the addition of two matrix
class Matrixadd{
   int[][] sumadd(int m1[][] , int m2[][]){
       int row = m1.length;
       int col = m1[0].length;
       int res [][] = new int[row][col];
       for (int i=0;i<=row-1;i++){
           for(int j =0;j<=col-1;j++){
              res[i][j]= m1[i][j]+m2[i][j];
           }
       }
   return res;
   }
}
public class Result_add_matrix {
    public static void main(String[] args) {
        Matrixadd mad =new Matrixadd();
        int m1[][]={{10,20,30,40},{20,30,40,50},{20,30,40,50},{20,30,40,50}};
        int m2[][]={{20,30,40,50},{10,20,30,40},{10,20,30,40},{10,30,40,50}};
         int res[][]= mad.sumadd(m1,m2);
         for(int i=0;i<= res.length-1;i++){
             for( int j=0;j<=res[0].length-1;j++){
                 System.out.print(res[i][j]+ " ");
             }
             System.out.println();
         }
    }
}
