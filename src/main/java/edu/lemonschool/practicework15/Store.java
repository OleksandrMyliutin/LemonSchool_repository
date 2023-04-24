package edu.lemonschool.practicework15;

import java.util.List;

public interface Store<T> {
    void addProduct(T product);
    boolean sellProduct(T product);
    List<T> getAllProducts();
    T getProductByName(String name);
}
