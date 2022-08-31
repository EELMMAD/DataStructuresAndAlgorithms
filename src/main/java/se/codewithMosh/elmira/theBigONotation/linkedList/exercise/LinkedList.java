package se.codewithMosh.elmira.theBigONotation.linkedList.exercise;

import java.util.NoSuchElementException;

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
    public void addFirst(int item) {
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
    }

    //addLast
    public void addLast(int item) {
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            last.next = node;
            last = node;
        }
    }

    //deleteFirst
    public void removeFirst() {
        //[10 -> 20 -> 30]
        //first -> 20
        //[20 -> 30]
        //we need two different references

        if (isEmpty())
            throw new NoSuchElementException();

        //for the list that have only one item
        if (first == last) {
            first = last = null;
            return;      //we do not want to execute the rest of code
        }

        //for the list that have at least two items
        var second = first.next;  // we have the second variable as backup here
        first.next = null;  // remove the link (->) between 10 -> 20   [10  20 -> 30]
        first = second;
    }

    //deleteLast
    public void removeLast() {
        //[10 -> 20 -> 30]
        // last -> 30
        //previous -> 20
        //last -> 20
        //[10 -> 20]

        if (isEmpty())
            throw new NoSuchElementException();

        //we have only one node
        if (first == last) {
            first = last = null;
            return;
        }


        // At least we have two nodes
        var previous = getPrevious(last);
        last = previous;
        last.next = null;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }


    //contains
    public boolean contains(int item) {
        return indexOf(item) != -1;  //if the expression evaluate to true that means we have this item in our list
    }

    //indexOf
    public int indexOf(int item) {
        int index = 0;
        var current = first;

        while (current != null) {
            if (current.value == item) return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    private boolean isEmpty() {
        return first == null;
    }
}
