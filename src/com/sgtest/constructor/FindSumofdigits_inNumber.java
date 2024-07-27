package com.sgtest.constructor;
// find the sum of digits in the given number
class FindSum{
    void adddig(int number){
        int sum=0;
        while(number > 0)
        {
            int digit = number % 10;
            sum=sum+digit;
            number=number/10;
        }
        System.out.println("The total Sum of the Digits:"+sum);
    }
    }


public class FindSumofdigits_inNumber {
    public static void main(String[] args) {
        FindSum fs = new FindSum();
        fs.adddig(2222);
    }
}
