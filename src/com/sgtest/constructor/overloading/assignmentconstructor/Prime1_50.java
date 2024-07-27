package com.sgtest.constructor.overloading.assignmentconstructor;
// wap to display prime nos from 1to 50
// verify the given number is prime or not
class Prme {
    void pm(int number) {
        int flag=0;
        for (int i=2;i<=number/2;i++)
        {
            if (number % i ==0)
            {
                flag+=1;
                break;
            }
        }
        if (flag > 0)
            System.out.println(number+", is not a Prime number");

        else {
            System.out.println(number + ", is a Prime number");
            for(int i =1;i<=50;i++){
                if(i==number){
                System.out.print("prime nos b/w 1 -50 are ;"+ number);
            }
        }
    }
  }
}
public class Prime1_50 {
    public static void main(String[] args) {
        Prme p =new Prme();
        p.pm(5);
    }
}
