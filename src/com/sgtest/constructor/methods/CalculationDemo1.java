package com.sgtest.constructor.methods;

//methods which does not return value
// methods which does not accept parameters
// here the values are hardcoded because of no usage of parameters
class Calculate{

   void addition(){
      int x,y,res;
      x=20;y=50;
      res=(x+y);
       System.out.println("addition result"+ res);
    }
    void multiplication(){
       int res,x,y;
       x=12;
       y=10;
       res =(x*y);
        System.out.println(res);

    }

}
public class CalculationDemo1 {
    public static void main(String[] args) {
        Calculate clt = new Calculate();
        clt.addition();
        clt.multiplication();
        clt.multiplication();
        clt.addition();
    }
}
