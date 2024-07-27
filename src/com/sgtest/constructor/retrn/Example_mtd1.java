package com.sgtest.constructor.retrn;

// example 2 we are using within the body of the other method
class Prime1{
    boolean isPrime(int num) {
        boolean prime = true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }
        return prime;
    }
 void show1() {
     // print prime numbers between 1 to 50
     for (int i = 1; i <= 50; i++) {
         if (isPrime(i) == true) {
             System.out.println(i + " ");
         }
     }
     System.out.println();
     System.out.println("----------------------------------------");
 }

void show2() {
    // printprime numbers betwen 200 to 500
    for (int i = 200; i <= 500; i++) {
        if (isPrime(i) == true) {
            System.out.println(i + " ");
        }
    }
    System.out.println();
    System.out.println("----------------------------------------");
}

     void show3(){
             // count of prime numbers in between 1 to 100
             int count=0;
             for(int i=1;i<=100;i++){
                 if(isPrime(i)==true){
                     count = count+1;

                 }
             }
             System.out.println(count + " prime number count ");
         }
 }

public class Example_mtd1 {
    public static void main(String[] args) {
        Prime1 o =  new Prime1();
        boolean val1=o.isPrime(27);
         o.show1();
        o.show2();
        o.show3();
    }
}
