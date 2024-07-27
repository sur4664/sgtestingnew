package com.sgtest.constructor.methods.assignments2;

/* for the given 2D double array display 1st row of the elements in rev order
step 1;assign all elements of ist row into iD array
step 2; rev the assigned 1D array
*/

class ReverseFirstRow {
    void displayFirstRowInReverse(double[][] array) {

           double[] firstRow = array[0];
            for (int i = firstRow.length - 1; i >= 0; i--) {
                System.out.print(firstRow[i] + " ");
            }
        }
    }



    public class Display1st_row_elements {
        public static void main(String[] args) {
            double[][] array = {
                    {1.1, 2.2, 3.3, 4.4},
                    {5.5, 6.6, 7.7, 8.8},
                    {9.9, 10.10, 11.11, 12.12}};
            ReverseFirstRow dfr =new ReverseFirstRow();
            dfr.displayFirstRowInReverse(array);
        }
    }


