package com.sgtest.constructor.retrn.Assignmentsreturn;
// Wa method  to return country name
class NameCountry{
   String cc(String name){
       return name;
   }
}
public class Countryname {
    public static void main(String[] args) {
        NameCountry nc = new NameCountry();
       String v= nc.cc("India");
        System.out.println(v);
    }
}
