package se.codewithMosh.elmira.theBigONotation.linkedList.exercise;

public class LinkedList {
    private class Node {
        private int value;
        private Node next;  // keep a reference to the next node

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first; //head
    private Node last; //tail


    //addFirst
    public void addFirst(int item){
        Node node = new Node(item);

        if(isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
    }

    //addLast
    public void addLast(int item){
        Node node = new Node(item);

        if(isEmpty())
           first = last = node;
        else {
            last.next = node;
            last = node;
        }
    }

    //deleteFirst
    //deleteLast
    //contains
    //indexOf



    private boolean isEmpty(){
        return first == null;
    }
}
