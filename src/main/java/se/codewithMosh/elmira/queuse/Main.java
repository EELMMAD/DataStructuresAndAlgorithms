package se.codewithMosh.elmira.queuse;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //printers
        //operating systems
        //web servers
        //live support systems


        //enqueue -> add of the item to the back of the queue   O(1)
        //dequeue -> removing an item at the front of a queue   O(1)
        //peek -> getting the item at the front without removing it O(1)
        //isEmpty O(1)
        //isFull O(1)


        //Deque -> double ended queues - queue which have two ends


        Queue<Integer> queue = new ArrayDeque<>();         //Queue -> Interface -> we can not instantiate it
        queue.add(10);
        queue.add(20);
        queue.add(30);
        reverse(queue);
        System.out.println(queue);

        /*
        var front =  queue.remove();
        System.out.println(front);
        System.out.println(queue);
         */
    }

    public static void reverse(Queue<Integer> queue){
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty())
            stack.push(queue.remove());
        while (!stack.isEmpty())
            queue.add(stack.pop());
    }
}
