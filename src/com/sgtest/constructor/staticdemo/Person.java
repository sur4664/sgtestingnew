package com.sgtest.constructor.staticdemo;
// instance variables object has to be created to access the instance variables ,methods,block
public class Person {
    String firstname;
    int age;

    public static void main(String[] args) {
        Person obj1=new Person();
        obj1.firstname="santosh";
        obj1.age = 22;
        System.out.println("first name ;"+obj1.firstname);
        System.out.println("Age :"+ obj1.age);
        System.out.println("--------------------------------------------------");

    }
}
