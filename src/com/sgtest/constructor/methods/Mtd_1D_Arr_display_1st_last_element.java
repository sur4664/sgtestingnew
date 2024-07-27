package com.sgtest.constructor.methods;
//Wa method for the given 1D int array display 1st and last element
class Display1{
  void  dis(int a[]){

      for(int i=0;i<=a.length-1;i++) {
          if (i == 0 || i == a.length - 1) {
              System.out.println(a[i]);
          }
      }
  }
}
public class Mtd_1D_Arr_display_1st_last_element {
    public static void main(String[] args) {
        int a[]={10,20,30,40};
        Display1 am =new Display1();
        am.dis(a);
    }
}
