package se.codewithMosh.elmira.collisions;

public class CollisionDefinition {
    /*
    when generating hash values, it is possible that two distinct keys generate the same hash
    value 10 For storing these two values.
    What are we going to do? we can not store two items at the same index.
    This is what we call a ***COLLISION***  (accident, crash).
    means our two values are colliding.

    There are two ways that we can handel collisions:
    1. One way to have each cell in our array point to linked list.
       so we are NOT going to store the value in the array itself
       we are going to store them in this link lists.
       If you have a collision with simply add the new item at the end of the link list.
       This is what we call ***CHAINING*** these items.

       2.Another solution is to find a different slot for storing the second value.
       this is what we call ***OPEN ADDRESSING***.
       Because we are fining a new address to store the second value.
     */
}
