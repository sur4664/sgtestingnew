package com.sgtest.constructor.retrn;
// write a method
class DisplayName{
     String getName(String name){
         return name;
     }
}
public class NameDemo {
    public static void main(String[] args) {
        DisplayName o = new DisplayName();
        String v1=o.getName("santosh");
        System.out.println(v1);
    }
}
