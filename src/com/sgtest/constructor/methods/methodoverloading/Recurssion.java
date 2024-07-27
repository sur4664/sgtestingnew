package com.sgtest.constructor.methods.methodoverloading;
// examples of recurssion with the help of method overloading
class BasicMaths{
    // print numbers from 1 to 10 without using any looping statements
    int num=10;
    void displaynumbers(){
        if(num<20){
            System.out.println(num);
            num=num+1;
            displaynumbers();
        }
    }
}
public class Recurssion {
    public static void main(String[] args) {
        BasicMaths o = new BasicMaths();
        o.displaynumbers();
    }
}
