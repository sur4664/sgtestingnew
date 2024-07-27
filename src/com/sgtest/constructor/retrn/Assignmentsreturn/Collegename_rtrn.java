package com.sgtest.constructor.retrn.Assignmentsreturn;
class Rcollege{
   String colrt(String name){
        return name;
    }
}
public class Collegename_rtrn {
    public static void main(String[] args) {
        Rcollege o1 = new Rcollege();
       String cn= o1.colrt("SSMRV");
        System.out.println( "My college name is:  "+cn);
    }
}
