package com.dio.base;

public class Order {
    
    private String[] items;

    public void printItems(){
        int i = 0;

        while(i < items.length){

            System.out.println(items[i]);
            i++;
        }
    }
}
 