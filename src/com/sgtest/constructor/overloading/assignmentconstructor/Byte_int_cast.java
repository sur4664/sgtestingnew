package com.sgtest.constructor.overloading.assignmentconstructor;
// write a method for the given byte array assign each element into int array and read
// the elements from the integer array
class Casting{
  void  castbyteint(byte[]byteArray){
      int[] intArray = new int [byteArray.length];
      for (int i=0;i<= byteArray.length-1;i++){
          intArray[i]=(int)byteArray[i];
      }
      for (int i=0;i<= intArray.length-1;i++){
          System.out.println(intArray[i]);
      }
  }
}
public class Byte_int_cast {
    public static void main(String[] args) {
        byte[] byteArray = {0, 1, 0, 2, 0, 3, 0, 4};
        int[] intArray = new int [byteArray.length];
        Casting cst =new Casting();
        cst.castbyteint(byteArray);

    }
}



