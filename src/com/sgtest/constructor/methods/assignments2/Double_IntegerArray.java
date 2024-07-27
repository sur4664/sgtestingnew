package com.sgtest.constructor.methods.assignments2;
// for the given double 2D 3*3 array assign each element into a
// 2D integer array and read the integer array elements
class Double_Int {
    void di2D(){
        double[][] a={{10.00,20.08,30.5},
                      {40.6,50.8,60.4},
                      {70.5,80.5,90.3}};
        int[][] b=new int[a.length][a[0].length];
        int k=0;
        System.out.println("Assign Elements to 2D Array");
        for (int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
              //  b[i][j]=a[k];
                k=k+1;
            }
        }
        System.out.println("Read the Elements from 2D Array");
        for (int i=0;i<b.length;i++)
        {
            for(int j=0;j<b[i].length;j++)
            {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }
    }

    }

public class Double_IntegerArray {
    public static void main(String[] args) {
       // double doubleArray[][]= {{10,20,30},{100,200,300},{40,50,60}};
       // int integerArray[][] = new int[doubleArray.length][doubleArray[0].length];
       // doubleArray[i][j]= integerArray[x][y];
        Double_Int di = new Double_Int();
        di.di2D();

    }
}
