package se.codewithMosh.elmira.linkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        System.out.println(list);
        System.out.println(list.contains(10));
        System.out.println(list.indexOf(10));
        list.addFirst(5);
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
        String array = list.toString();
        System.out.println(array);
        System.out.println(list.size());
    }
}
