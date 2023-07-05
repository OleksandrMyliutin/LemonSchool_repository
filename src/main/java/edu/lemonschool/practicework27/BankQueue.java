package edu.lemonschool.practicework27;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
public class BankQueue {
    private BlockingQueue<Customer> queue;
    public BankQueue(){
        queue = new ArrayBlockingQueue<>(10);
    }
    public void enqueue(Customer customer) throws InterruptedException{
        queue.put(customer);
        System.out.println("Customer " + customer.getCustomerId() + " зайшов у чергу!");
    }

    public Customer dequeue() throws InterruptedException{
        Customer customer = queue.take();
        System.out.println("Customer" + customer.getCustomerId() + "вийшов з черги!");
        return customer;
    }
}
