package com.sgtest.constructor.retrn.Assignmentsreturn;
// wam  which has to return  second half of the elements
//from given 1D double array
class OneDarray{
  double[] secondhalf(double d[]){
      double a[]= new double[d.length/2];
      int z =0;
      for(int i =d.length/2;i<=d.length-1;i++){
         a[z]=d[i];
         z++;

      }
      return a;
  }
}
public class Returns_sec_half_Array {
    public static void main(String[] args) {
        OneDarray ob= new OneDarray();
        double sec[]={10.10,20.15,40.45,60.95,70.98,80.08};
        double value[] =ob.secondhalf(sec);
        for(double x:value){
            System.out.println(x);
        }

    }
}
