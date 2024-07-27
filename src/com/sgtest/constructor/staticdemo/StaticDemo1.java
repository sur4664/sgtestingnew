package com.sgtest.constructor.staticdemo;
// concatination result of 2D string array
class Demo1{
   static String getCocatinate(String str[][]){
        String s="";
        for(int i=0;i<= str.length-1;i++){
            for(int j=0;j<=str[i].length;j++){
                s=s+str[i][j]+"";

            }
        }
        return s;
    }

}
public class StaticDemo1 {
    public static void main(String[] args) {
        String val =Demo1.getCocatinate(new String[][]{{"qq"},{"ss"},{"tt"}});
        System.out.println(val);
    }
}
