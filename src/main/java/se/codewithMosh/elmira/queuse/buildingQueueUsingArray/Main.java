package se.codewithMosh.elmira.queuse.buildingQueueUsingArray;

public class Main {
    public static void main(String[] args) {
        //ArrayQueue (ArrayDeque)
        //enqueue -> add of the item to the back of the queue   O(1)
        //dequeue -> removing an item at the front of a queue   O(1)
        //peek -> getting the item at the front without removing it O(1)
        //isEmpty
        //isFull
        //[10, 20, 30, 40, 50]
        //     F            R
        //F = 0   front of our queue
        //R = 3   end of our queue


        ArrayQueue queue = new ArrayQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.dequeue();
        var front = queue.dequeue();
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);
        queue.dequeue();
        queue.enqueue(80);
        System.out.println("front: " + front);
        System.out.println(queue);
    }
}
