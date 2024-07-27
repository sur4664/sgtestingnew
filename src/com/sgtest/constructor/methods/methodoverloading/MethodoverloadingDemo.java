package com.sgtest.constructor.methods.methodoverloading;
// method overloading
class Maths4{
    void addition(int x,int y){
        System.out.println("addition"+ x+y);
    }
    void addition(int x,int y ,int z){
        System.out.println("addition"+ x+y+z);
    }
    void addition(int arr[]){
        int sum =0;
        for(int x:arr){
            sum+=x;
            System.out.println(sum);
        }

    }
}
public class MethodoverloadingDemo {
    public static void main(String[] args) {
        Maths4 obj = new Maths4();
        obj.addition(new int[]{10,20,30,40,50,60});
        obj.addition(10,20);
        obj.addition(20,40,50);







     String str ="programming";
     String s1 =str.substring(3);
        System.out.println(s1);
        String s2 =str.substring(3,7);
        System.out.println(s2);
    }
}
