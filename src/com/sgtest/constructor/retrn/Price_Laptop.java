package com.sgtest.constructor.retrn;
class Price{
    int laptopPrice(int price){
        return price;
    }
}


public class Price_Laptop {
    public static void main(String[] args) {
       Price p = new Price();
       p.laptopPrice(10000);
    }
}
