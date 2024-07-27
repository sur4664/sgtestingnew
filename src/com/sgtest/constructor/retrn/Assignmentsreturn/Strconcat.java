package com.sgtest.constructor.retrn.Assignmentsreturn;
//concatenation result of 2 string arrays
class Concat{
    String result(String s1[],String s2[]){
        String s3="   ";
        for (String i : s1){
            s3+=i;
        }
        for(String i: s2){
            s3+=i;
        }
        return s3;
    }
}

public class Strconcat {
    public static void main(String[] args) {
        Concat res= new Concat();
        String s1[]={"yuktha","deepa"};
        String s2[]={"Cherry","Suraj"};
        String s3= res.result(s1,s2);
        System.out.println( " concatinated result of two string arrays:"+s3);

    }

}




