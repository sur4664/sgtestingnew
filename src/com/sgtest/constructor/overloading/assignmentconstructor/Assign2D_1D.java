package com.sgtest.constructor.overloading.assignmentconstructor;
//for the given 2D integer array assign all the elements of 2D array into 1D array,
// read the elements from 1D array
class Two2D_1D
{
    Two2D_1D(int[][] a, int[] b){

    }
}






    public class Assign2D_1D
{
    public static void main(String[] args)
    {
        int a[][]={{100,200,300},{1000,2000,3000},{400,500,600}};

        int b[]=new int [a.length*a[0].length];
        Two2D_1D t21 = new Two2D_1D(a,b);
    }
}
