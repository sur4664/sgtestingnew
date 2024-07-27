package com.sgtest.constructor.methods.assignments2;
//write a method  it should display the count of even numbers in between 1 to 500
class Count{
   void cteven(){
        int count =0;
        for( int i =1;i<=500;i++){
            if(i%2==0){
                count = count+ i;
            }
        }
        System.out.println(count);
   }
}



class Even_count_1_500 {
    public static void main(String[] args) {
        Count ct =new Count();
        ct.cteven();

    }

}
