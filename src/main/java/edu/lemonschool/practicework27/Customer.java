package edu.lemonschool.practicework27;

public class Customer implements  Runnable{
    private int customerId;
    private int needServerTime;

    public Customer(int customerId, int needServerTime) {
        this.customerId = customerId;
        this.needServerTime = needServerTime;
    }

    public int getCustomerId() {
        return customerId;
    }

    public int getNeedServerTime() {
        return needServerTime;
    }

    @Override
    public void run() {
        System.out.println("Користувач " + "№" + customerId + "started!");
        System.out.println("Користувач " + "№" + customerId + "completed!");

    }
}
