package se.codewithMosh.elmira.collisions;

public class ChainingDefinition {
    /*
    one of the ways to handel collisions is ***CHAINING***
    Chaining is using the linkedList to store multiple items at the same array index.
    look at the real example:

    the size of our hash table is five
    -0
    -1
    -2
    -3
    -4
    So we have an array of five cells for storing items.
    we refer to this sales as *** BUCKET / SLOT***.

    -0    *** BUCKET / SLOT***.
    -1
    -2
    -3
    -4

    initially all our buckets or slots are null or empty.
    Now we want to store to this key value pair in our hash table:
    K = 6
    V = 8

    The key is 6 and the value is eight.
    We pass the key to our hash function and our hash function
    return the remainder of division of six by five which is one.
    so we should store this value at index one BUT we are not going to store this value
    directly in the sale, instead we are going to wrap it in a linked list node and have to sell
    at index one point to this node.
    -0
    -1 -----> A
    -2
    -3
    -4

    Now we have this other key value pair. Where should we store this pair?
    K = 8
    V = 8

    if we give 8 to our hash function we will get 3      8 % 5 = 3
    So we should store the value at index 3. BUT again we are NOT going to store it
    directly in the cell, instead we are going to store it in a link list.
    -0
    -1 -----> A
    -2
    -3 -----> B
    -4

     let look ar another example:
     K = 11

     if we give it to the hash function , we will get one        11 % 5 = 1
     So we should go to the cell at index one and store this value at the END OF the linked list

    -0
    -1 -----> A -----> C
    -2
    -3 -----> B
    -4

    This is the idea behind chaining.
    we are basically ***CHAINING*** a bunch of items together
    that is where the name comes from.
    But in this approach will NO longer have collisions and this link list can
    grow or shrink automatically.
     */
}
