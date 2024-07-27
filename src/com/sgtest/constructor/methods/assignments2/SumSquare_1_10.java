package com.sgtest.constructor.methods.assignments2;
//Write a method the method has   to display sum of square of each number in b/w 1 to 10
class Ss110 {
    void square() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i * i;
           // System.out.println(sum);
        }
        System.out.println( " sum of square of each number b/w 1 to 10 :"+  sum);
    }
}

    public class SumSquare_1_10 {
        public static void main(String[] args) {
            Ss110 s = new Ss110();
            s.square();
        }
    }

