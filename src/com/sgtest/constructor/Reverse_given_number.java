package com.sgtest.constructor;
// Wap to reverse the given number
class RevNum{
    void numrev(int number){
        int Reverse=0;
        while(number > 0)
        {
            int lastdigit=number % 10;
            System.out.println("Last digit "+lastdigit);
            Reverse=Reverse*10+lastdigit;
            System.out.println("Reverse Number "+Reverse);
            number=number/10;
        }
        System.out.println("The Reverse of Given input number:"+Reverse);
    }
}

public class Reverse_given_number {
    public static void main(String[] args) {
         RevNum rn = new RevNum();
         rn.numrev(1995);
    }

}
