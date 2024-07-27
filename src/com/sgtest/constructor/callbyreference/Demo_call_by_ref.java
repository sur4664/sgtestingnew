package com.sgtest.constructor.callbyreference;
class Ddref_byvalue{
    int x,y;
    void calculate(Ddref_byvalue o1){
        o1.x+=100;
        o1.y*=9;
        System.out.println("in method value of x"+x);
        System.out.println(" in method value of y"+y);


    }

}
public class Demo_call_by_ref {
    public static void main(String[] args) {
        Ddref_byvalue o1 = new Ddref_byvalue();
        o1.x=10;
        o1.x=5;
        System.out.println("value of x"+o1.x);
        System.out.println("value of y"+o1.y);
        o1.calculate(o1);
        System.out.println("after method execution value of x"+o1.x);
        System.out.println("after method execution value of y"+o1.y);

    }
}
