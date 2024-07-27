package com.sgtest.constructor.retrn;
class RetArr{
   String[] dishes(){
        String dsh[]={"puri","pongal"};
       return dsh;
   }
}
public class Array_return {
    public static void main(String[] args) {
        RetArr o = new RetArr();
        String dsh[]=o.dishes();
        for(String d : dsh){
            System.out.println(d);
        }
    }
}
