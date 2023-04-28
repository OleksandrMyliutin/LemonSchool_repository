package edu.lemonschool.practicework15;

import java.util.ArrayList;
import java.util.List;

public class HardwareStore implements  Store<Hardware>{

    private final List<Hardware> productsList;

    public HardwareStore() {
        this.productsList = new ArrayList<>();
    }


    @Override
    public void addProduct(Hardware product) {
        productsList.add(product);
    }

    @Override
    public boolean sellProduct(Hardware product) {
        return productsList.remove(product);
    }

    @Override
    public List<Hardware> getAllProducts() {
        return productsList;
    }

}
