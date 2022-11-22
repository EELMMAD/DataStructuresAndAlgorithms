package se.codewithMosh.elmira.queuse.priorityQueues;

public class Main {
    public static void main(String[] args) {
        //priorityQueue
        //insert(2)
        //[1, 2, 3, 4, 7]
        // 0  1  2  3  4
        //items[i + 1] = items[i]

        PriorityQueue queue = new PriorityQueue();
        queue.add(5);
        queue.add(3);
        queue.add(6);
        queue.add(1);
        queue.add(4);
        System.out.println(queue);

        while(!queue.isEmpty()){
            System.out.println(queue.remove());
        }
    }
}
