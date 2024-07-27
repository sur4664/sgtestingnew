package com.sgtest.constructor;

public class ExplicitCasting {
    public static void main(String[] args) {
   /*     Narrowing or Explicit Type Casting:
        1.Both source and destination data types should be Compatible.
        2.Source data type higher than destination data type
        double -->float --> long --> int --> short --> byte
package com.sgsoftwaretesting.interviewquestionsandanswers;
        public class CastingDemo {
            public static void main(String[] args) {

    */
//Explicit Type Casting case 1:
                System.out.println("Explicit Type Casting case 1:");
                int i=125;
                System.out.println("int :"+i);
                byte b=(byte) i;
                System.out.println("byte :"+b);
//Explicit Type Casting case 2:
                System.out.println("Explicit Type Casting case 2:");
                int k=69;
                System.out.println("int :"+k);
                char ch=(char) k;
                System.out.println("char :"+ch);
//Explicit Type Casting case 3:
                System.out.println("Explicit Type Casting case 3:");
                double d=125.75;
                System.out.println("double :"+d);
                long e=(long) d;
                System.out.println("long :"+e);
//Explicit Type Casting case 4:
                System.out.println("Explicit Type Casting case 4:");
                int j=300;
                System.out.println("int :"+j);
                byte b1=(byte) j; // it applies modulus so the result is 44
                System.out.println("byte :"+b1);
            }
        }
    /*    Output:
        Explicit Type Casting case 1:
        SG SOFTWARE TESTING INSTITUTE
        www.sgtestinginstitute.com
        int :125
        byte :125
        Explicit Type Casting case 2:
        int :69
        char :E
        Explicit Type Casting case 3:
        double :125.75
        long :125
        Explicit Type Casting case 4:
        int :300
        byte :44
    }
}
*/