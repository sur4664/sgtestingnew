package com.sgtest.constructor.methods.assignments2;
 class one_twenty{
     void ott( int i){


             for ( i = 1; i <=10; i++) {
                 int num =i*1;
                     System.out.println("1 *" + i + "=" + num);
                     for (int j = 1; j <=20; j++) {
                          num = i * j;
                         System.out.print(j + "*" + i + "=" + num + "  ");
                     }
                 }
             }

}
public class Tables1_20 {
    public static void main(String[] args) {
       one_twenty obj =new one_twenty();
       obj.ott(1);
    }
}
