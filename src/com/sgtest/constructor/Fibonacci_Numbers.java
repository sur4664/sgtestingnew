package com.sgtest.constructor;
// display the first 10 fibonacci numbers
public class Fibonacci_Numbers {
    public static void main(String[] args) {
        System.out.println("display the First 10 Fibonacci Numbers:");
        int first=0;
        int second=1;
        System.out.print(first+","+second);
        for (int i=2;i<=10;i++)
        {
            int third=first+second;
            System.out.print(","+third);
            first=second;
            second=third;
        }
    }
}
/*
Output:
display the First 10 Fibonacci Numbers:
        0,1,1,2,3,5,8,13,21,34,55

 */