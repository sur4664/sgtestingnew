package com.sgtest.constructor.retrn;
// example 2 we are using within the body of the other method
class Prime{
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

}
public class PrimenumbersDemo {
    public static void main(String[] args) {
     Prime o =  new Prime();
     boolean val1=o.isPrime(27);
        System.out.println(val1);
        System.out.println("---------------------------------------");
       // print prime numbers between 1 to 50
       for(int i=1;i<=50;i++){
           if(o.isPrime(i)==true){
               System.out.println(i + " ");
           }
       }

        System.out.println();
        System.out.println("-------------------------------------------");
// printprime numbers betwen 200 to 500
        for(int i=200;i<=500;i++){
            if(o.isPrime(i)==true){
                System.out.println(i + " ");
            }
        }
        System.out.println();
        System.out.println("----------------------------------------");
        // count of prime numbers in between 1 to 100
        int count=0;
        for(int i=1;i<=100;i++){
            if(o.isPrime(i)==true){
                count = count+1;

            }
        }
        System.out.println(count + " prime number count ");
    }
}
