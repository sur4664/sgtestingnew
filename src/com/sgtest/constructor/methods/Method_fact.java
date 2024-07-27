package com.sgtest.constructor.methods;
class Factoral{
    void facto(int num ){
        int fact =1;
        for(int i=num; i >= 1;i--){
            fact= fact*i;
        }
        System.out.println("Factoral of "+num+"is "+ fact);
    }
    }

public class Method_fact {
    public static void main(String[] args) {
        Factoral ft = new Factoral();
        ft.facto(100);
        ft.facto(500);
        ft.facto(8);
        ft.facto(900);
        ft.facto(8);
    }
}
