package com.sgtest.constructor.retrn.Assignmentsreturn;
// wam which return your favorite colourname
class Ftrcl{
  String  clft(String colour){
      return colour;
  }
}
public class FavClr {
    public static void main(String[] args) {
        Ftrcl  Ft = new Ftrcl();
        String favcolour =Ft.clft("Orange");
        System.out.println(favcolour);
    }
}
