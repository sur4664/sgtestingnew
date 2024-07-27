package com.sgtest.constructor.overloading.assignmentconstructor;
//WA method it has to display 4*4 2D array it has to display 3rd and 4th row elements alone
class Elements{
    void read(int a[][]){
      for(int i=a.length/2;i<=a.length-1;i++){
          for(int j =a[2].length;j<=a[i].length-1;j++){
              System.out.print(a[i][j]+ " ");
          }
      }
      System.out.println();
    }
}
public class Third_fourthElement {
    public static void main(String[] args) {
      int  a[][] = {{10,20,30,40},
                    {20,30,40,50},
                    {40,50,60,70},
                    {30,40,50,60}};
        Elements obj = new Elements();
        obj.read(a);
    }
}
