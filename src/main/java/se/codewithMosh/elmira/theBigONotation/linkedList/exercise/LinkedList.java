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
    private int size;


    //addFirst
    public void addFirst(int item) {
        var node = new Node(item);

        if (isEmpty())
            first = last = node;
        else {
            node.next = first;
            first = node;
        }
        size++;
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
        size++;
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

        size--;
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
        if (first == last)
            first = last = null;
        else{
        // At least we have two nodes
        var previous = getPrevious(last);
        last = previous;
        last.next = null;
        }
        size--;
    }

    private Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node) return current;
            current = current.next;
        }
        return null;
    }

    //implementing the size
    //O(n)
    public int size(){
        return size;
    }


    //converting link list to array
    public int[] toArray(){
        int[] array = new int[size];
        var current = first;
        var index = 0;
        while (current != null){
            array[index++] = current.value;
            current = current.next;
        }
        return array;
    }

    //reverse()
    public void reverse(){
        //f            l
        //[10 -> 20 -> 30]
        //[10 <- 20 -> 30]
        //[10 <- 20  30]
        //[10 <- 20 <- 30]      previous p      current c     next n
        // p      c     n
        // n = c.next
        //c.next = p
        //[10 <- 20  30]

        //[10 <- 20   30]      previous p      current c     next n
        //        p      c     n
        //[10 <- 20 <- 30]
        //              p      c     n

        if(isEmpty()) return;
        var previous = first;
        var current = first.next;
        while(current != null){
          var next = current.next;
          current.next = previous;
          current = next;
          previous = current;
        }
        last = first;
        last.next = null;
        first = previous;
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



    //getKthFromTheEnd(k)

    //Find the Kth node from the end
    //of a linked list in one pass.

    //[10 -> 20 -> 30 -> 40 -> 50]
    //              *           *
    //K = 1 (50)
    //K = 2 (40)
    //K = 3 (30)   (distance = 2)

   public int getKthFromTheEnd(int k) throws IllegalAccessException {
        if(isEmpty())
            throw new IllegalStateException();
      var a = first;
      var b = first;
      for(int i = 0; i < k - 1; i++) {
          b = b.next;
          if(b == null)
              throw new IllegalAccessException();
      }
          while(b != last){
              a = a.next;
              b = b.next;
          }
      return a.value;
   }







    private boolean isEmpty() {
        return first == null;
    }

}
