package se.codewithMosh.elmira.queuse.buildingQueueUsingStack;

import java.util.Stack;

//Q  [10, 20, 30]
//S1 [10, 20, 30]  //enqueue
//S2 [30, 20 , 10]   //dequeue
public class QueueWithTwoStacks {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    //O(1)
    public void enqueue(int item){
        stack1.push(item);
    }

    //O(n)
    public int dequeue(){
        if(isEmpty())
            throw new IllegalStateException();

        moveStack1ToStack2();
        return stack2.pop();
        }

    private void moveStack1ToStack2() {
        if(stack2.isEmpty())
            while (!stack1.isEmpty())
                stack2.push(stack1.pop());
    }

    public int peek(){
        if(isEmpty())
            throw new IllegalStateException();

        moveStack1ToStack2();
        return stack2.peek();
        }


        public boolean isEmpty(){
        return stack1.isEmpty() && stack2.isEmpty();
        }
}
