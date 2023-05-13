package edu.lemonschool.practicework18.list;

import java.util.ArrayList;

public interface List <T>{
    void add (T element);
    void add (int index, T element);
    void set(int index, T element);
    T get(int index);
    T getFirst();
    T getLast();
    ArrayList<T> getAll();
    T remove(int index);
    boolean contains(T element);
    boolean isEmpty();
    int size();
    void clear();
}
