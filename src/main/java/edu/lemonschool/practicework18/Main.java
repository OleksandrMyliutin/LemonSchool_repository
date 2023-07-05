package edu.lemonschool.practicework18;

import edu.lemonschool.practicework18.queue.Queue;
import edu.lemonschool.practicework18.queue.SimpleQueue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new SimpleQueue<>();
        integerQueue.push(75);
        integerQueue.push(14);
        integerQueue.push(9);
        integerQueue.push(23);
        integerQueue.push(48);

        System.out.println(integerQueue);

        integerQueue.pop();
        System.out.println(integerQueue);

        System.out.println(integerQueue.peak());
        System.out.println(integerQueue);
    }
}
