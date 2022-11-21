package se.codewithMosh.elmira.stacks.reversingTheStrinExercise;

import java.util.Stack;

public class StringReverser {
    public String reverse(String input) {
        if (input == null)
            throw new IllegalArgumentException();
        Stack<Character> stack = new Stack<>();

        //for (int i = 0; i <input.length(); i++){
        // stack.push(input.charAt(i));


        //in java we can not use a forEach loop for a string, but
        // we can convert that String to a Character Array and then use forEach loop for that array
        for (char ch : input.toCharArray())
            stack.push(ch);

        StringBuffer reversed = new StringBuffer();
        while (!stack.empty())
            reversed.append(stack.pop());
        return reversed.toString();
    }
}
