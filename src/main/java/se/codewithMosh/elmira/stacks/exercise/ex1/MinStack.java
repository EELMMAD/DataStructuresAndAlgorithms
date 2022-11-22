package se.codewithMosh.elmira.stacks.exercise.ex1;
/*
Design a stack that supports push, pop and retrieving the minimum value in constant time.
for example, we populate our stack with[5, 2, 10, 1] (from left to right).

stack.min() //1
stack.pop()
stack.min() //2
 */

import se.codewithMosh.elmira.stacks.exercise.Stack;

//we need two stacks to implement the min stack.
//One stack holds the values, the other stack (called minStack) holds the minimums.
public class MinStack {
    private Stack stack = new Stack();
    private Stack minStack = new Stack();

    public void push(int item){
        stack.push(item);
        if(minStack.isEmpty())
            minStack.push(item);
        else if(item < minStack.peek())
            minStack.push(item);
    }

    public int pop(){
        if(stack.isEmpty())
            throw new IllegalStateException();

        var top = stack.pop();
        if(minStack.peek() == top)
            minStack.pop();

        return top;
    }

    public int min(){
        return minStack.peek();
    }
}
