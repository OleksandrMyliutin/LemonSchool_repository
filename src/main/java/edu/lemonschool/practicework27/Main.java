package edu.lemonschool.practicework27;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BankQueue bankQueue = new BankQueue();
        Thread[] windowThreads = new Thread[3];

        for (int i = 1; i <= 10; i++){
            Customer customer = new Customer(i, (int) (Math.random()*3000)+ 1000);
            bankQueue.enqueue(customer);
            Thread.sleep(500);
        }

        for (int i = 0; i < windowThreads.length; i++){
            BankWindow bankWindow = new BankWindow(i + 1, bankQueue);
            windowThreads[i] = new Thread(bankWindow);
            windowThreads[i].start();
        }

        for (Thread  windowThread: windowThreads) {
            windowThread.join();
        }
    }
}
