package se.codewithMosh.elmira.theBigONotation.stacks.reversingTheStrinExercise;

public class Main {
    public static void main(String[] args) {
        String str = "abcd";

        StringReverser reverser = new StringReverser();
        var result = reverser.reverse(null);
        System.out.println(result);
    }
}
