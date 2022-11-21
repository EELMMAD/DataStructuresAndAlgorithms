package se.codewithMosh.elmira.queuse;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

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
        var front =  queue.remove();
        System.out.println(front);
        System.out.println(queue);
    }
}
