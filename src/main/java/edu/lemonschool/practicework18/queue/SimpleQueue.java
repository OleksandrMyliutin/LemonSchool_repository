package edu.lemonschool.practicework18.queue;


import java.util.*;

public class SimpleQueue<E> implements Queue<E> {
    static class Node<E> {
        E value;
        Node<E> next;

        public Node(E value, Node<E> next) {
            this.value = value;
            this.next = next;
        }

        public Node() {
            value = null;
            next = null;
        }

        public Node(E value) {
            this.value = value;
            next = null;
        }
    }
    int size = 0;
    Node<E> head;
    Node<E> tail;

    public SimpleQueue(int size, Node<E> head, Node<E> tail) {
        this.size = size;
        this.head = head;
        this.tail = tail;
    }

    public SimpleQueue() {
        this.head = this.tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }
    @Override
    public void push(E value) {
        Node<E> newNode = new Node<E>(value);
        if(isEmpty()){
            head = tail = newNode;
        }else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    @Override
    public E pop() {
        Node<E> temp = head;
        checkListIsEmptyThrowException();
        if (size == 1){
            head = tail = null;
        }else {
            head = head.next;
            temp.next = null;
        }
        size --;
        return temp.value;
    }

    private void checkListIsEmptyThrowException() {
        if(isEmpty()) {
            throw new NoSuchElementException("List is empty");
        }
    }


    @Override
    public E peak() {
        checkListIsEmptyThrowException();
        return head.value;
    }

    @Override
    public Object[] toArray() {
        checkListIsEmptyThrowException();
        Object[] result = new Object[size];
        Node<E> temp = head;
        for (int i = 0; Objects.nonNull(temp); i++) {
            result[i] = (Object) temp.value;
            temp = temp.next;
        }
        return result;
    }

    @Override
    public String toString() {
        return Arrays.toString(toArray());
    }

    public int size() {
        return size;
    }
}
