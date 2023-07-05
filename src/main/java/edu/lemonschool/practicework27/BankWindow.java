package edu.lemonschool.practicework27;

public class BankWindow implements Runnable{
    private final int windowNumber;
    private final BankQueue queue;

    public BankWindow(int windowNumber, BankQueue queue) {
        this.windowNumber = windowNumber;
        this.queue = queue;
    }

    public void ServeNextCustomer() throws InterruptedException{
        Customer customer = queue.dequeue();
        System.out.println("Вікно№ " + windowNumber + " опрацювання користувача " + customer.getCustomerId());
        Thread.sleep(customer.getNeedServerTime());
        System.out.println("Вікно№ " + windowNumber + " завершення опрацювання користувача " + customer.getCustomerId());
    }

    @Override
    public void run() {
        try {
            while (true){
                ServeNextCustomer();
            }
        }catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

    }
}
