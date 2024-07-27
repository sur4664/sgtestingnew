package com.sgtest.constructor.methods.assignments2;
// write a method to display the charcters from p to z
class Pzchar{
    void chpz(char ch){
         for (char c ='p';c<='z';c++){
             System.out.print(c);
         }

    }
}
public class CharP_Z {
    public static void main(String[] args) {
        Pzchar pz = new Pzchar();
        pz.chpz('p');
    }
}
