package se.codewithMosh.elmira.theBigONotation.arrays.dynamicArray;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //Vector: 100%  -synchronized (At the same time)
        //ArrayList: 50%

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.remove(0);
        System.out.println(list);
    }
}
