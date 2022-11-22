package se.codewithMosh.elmira.queuse.buildingQueueUsingArray;

import java.util.Arrays;

public class ArrayQueue {
    private int[] items;
    private int front;
    private int rear;   //(back)

    //what if our queue get full ->
    // we need another field to keep track of number of items in the queue
    private int count;


    public ArrayQueue(int capacity){
        items = new int[capacity];
    }

    /*
    Circular Arrays:
    [0, 0, 30, 40, 50]
    [60, 70, 30, 40, 50]
                     R
     5 -> 0       left % length
     6 -> 1
     7 -> 2
     8 -> 3
     9 -> 4
     10 -> 0
     11 -> 1

     Circular Arrays formula:
     (rear + 1)  % length
     */
    public void enqueue(int item){
        if(count == items.length){  // means the queue is full
            throw new IllegalStateException();
        }
        items[rear] = item;
        //Circular arrays:
        rear = (rear + 1) % items.length;
        count++;
    }

    public int dequeue(){
        var item = items[front];
        items[front] = 0;
        //Circular arrays:
        front = (front + 1) % items.length;
        count--;
        return item;
    }

    public int peek(){
        if(isEmpty())
            throw new IllegalStateException();
        return items[front];
    }

    public boolean isEmpty(){
        return count == 0;
    }

    public boolean isFull(){
        return count == items.length;
    }

    @Override
    public String toString(){
        return Arrays.toString(items);
    }
}
