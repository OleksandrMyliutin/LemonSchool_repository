package edu.lemonschool.practicework18;

import edu.lemonschool.practicework18.list.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("1");
        linkedList.add("2");
        linkedList.add("3");
        linkedList.add("4");
        System.out.println(linkedList.getAll());
        System.out.println("Чи пустий список?");
        System.out.println(linkedList.isEmpty());
        System.out.println("Додали елемент на початок листу:");
        linkedList.add(0,"(6)");
        System.out.println(linkedList.getAll());
        System.out.println("Додали елемент десь в середину листу:");
        linkedList.add(3,"(9)");
        System.out.println(linkedList.getAll());
        System.out.println("Додали елемент в кінець листу:");
        linkedList.add(6,"(11)");
        System.out.println(linkedList.getAll());
        System.out.println("Вивести перший елемент листу:");
        System.out.println(linkedList.getFirst());
        System.out.println("Вивести останій елемент листу:");
        System.out.println(linkedList.getLast());
        System.out.println("Вивести якийсь елемент з листу:");
        System.out.println(linkedList.get(4));
        System.out.println("Видалити елемент з листу, наприклад на місці '3':");
        linkedList.remove(3);
        System.out.println(linkedList.getAll());
        System.out.println("Чи містить ліст '1'?");
        System.out.println(linkedList.contains("1"));
        System.out.println("А число '12'?");
        System.out.println(linkedList.contains("12"));
        System.out.println("Замінити число в позиції '4':");
        linkedList.set(4,"[22]");
        System.out.println(linkedList.getAll());
        System.out.println("Який розмір ліста ??");
        System.out.println(linkedList.size());
        System.out.println("Очистимо та виведемо розмір:");
        linkedList.clear();
        System.out.println(linkedList.size());


    }
}
