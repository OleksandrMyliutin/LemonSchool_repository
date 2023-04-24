package edu.lemonschool.practicework15;

import java.math.BigDecimal;
import java.util.List;

public class Basket <T extends Hardware>{
    private List<T> basket;
    private int quantity;
    private BigDecimal sum;


    public void addProduct(T product) {
        basket.add(product);
    }
    public int quantityProduct(T product){
        String s = String.valueOf(product);
        String [] words = s.split("\\s+");
        for (int i = 0; i < words.length; i++) {
            int quantity = i;
        }
        return quantity;
    }
}
