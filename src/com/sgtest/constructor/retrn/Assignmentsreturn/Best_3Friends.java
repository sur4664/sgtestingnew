package com.sgtest.constructor.retrn.Assignmentsreturn;
class B3F
{
    String[] f3(String arr[])
    {
        String a[] = new String[arr.length];
        int k = 0;
        for (int i = 0; i < arr.length; i++)
        {
            a[k] = arr[i];
            k++;
        }
        return a;
    }

}

public class Best_3Friends {
    public static void main(String[] args) {
        B3F bfs= new B3F();
        String arr[]= {"naveen","satish","yogesh"};
        String b[]= bfs.f3(arr);
        for(String v:b){
            System.out.println(v);
        }

    }
}
