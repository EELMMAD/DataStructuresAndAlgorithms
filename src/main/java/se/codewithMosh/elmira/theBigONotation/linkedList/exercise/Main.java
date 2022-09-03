package se.codewithMosh.elmira.theBigONotation.linkedList.exercise;

public class Main {
    public static void main(String[] args) {
        /*
        java.util.LinkedList<String> x = new java.util.LinkedList<>();
        x.removeFirst();  //You can not delete item from empty list
        //NoSuchElementException --> deliberate error handling

         */

        LinkedList list = new LinkedList();
        System.out.println("first size: " + list.size());

        list.addFirst(10);
        System.out.println("second size: " + list.size());
        list.addLast(20);
        list.addLast(30);
        System.out.println("third size: " + list.size());

        list.removeLast();
        list.removeFirst();
        System.out.println("forth size: " + list.size());



        //test indexOf()
        System.out.println(list.indexOf(10));
        System.out.println(list.indexOf(30));
        System.out.println(list.indexOf(40));

        //test contains()
        System.out.println(list.contains(40));
        System.out.println(list.contains(10));

        //test removeFirst
        list.removeFirst();

        //test removeFirst
        list.removeLast();
    }
}
