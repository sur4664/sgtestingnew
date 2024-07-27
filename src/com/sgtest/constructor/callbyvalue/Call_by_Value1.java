package com.sgtest.constructor.callbyvalue;
class Cbv_1{
    void calculate(int x,int y){
        x+=100;
        y*=9;
        System.out.println("value inside method"+ x);
        System.out.println("value inside method "+ y);
    }
}
public class Call_by_Value1 {
    public static void main(String[] args) {
        int x= 10;
        int y= 5;
        System.out.println("value of x"+ x);
        System.out.println("value of y" + y);
        Cbv_1 o = new Cbv_1();
        o.calculate(x,y);
        System.out.println("after method execution "+ x);
        System.out.println("after method execution "+ y);
    }
/*   output
    value of x10
    value of y5
    value inside method110
    value inside method 45
    after method execution 10
    after method execution 5

 */

}
