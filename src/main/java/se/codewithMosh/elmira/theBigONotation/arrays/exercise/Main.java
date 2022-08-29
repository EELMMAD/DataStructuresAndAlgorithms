package se.codewithMosh.elmira.theBigONotation.arrays.exercise;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Array numbers = new Array(3);
        numbers.insert(10);
        numbers.insert(20);
        numbers.insert(30);
        numbers.insert(40);
        System.out.println(numbers.indexOf(100));
        numbers.print();
    }
}
