package edu.lemonschool.practicework15;

import java.util.List;

public class HardwareStore implements  Store<Hardware>{
//    protected String router;
//    protected String RAM;
//    protected String hard_disk;
//    protected String ssd_disk;
//    protected String computer_case;
//    protected String motherboard;
//    protected String keyboard;
//    protected String computer_mouse;
//    protected String monitor;
//    protected String stickers;
//    protected String flash_drive;
//    protected String video_card;
//    protected String coolers;
//    protected String power_supply;
    private List<Hardware> productsList;
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

    @Override
    public Hardware getProductByName(String name) {
        return null;
    }
}
