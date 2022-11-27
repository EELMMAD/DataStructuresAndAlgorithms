package se.codewithMosh.elmira.collisions;

public class LinearProbingDefinition {
    /*
    There is another strategy for handling collisions we call it *** OPEN ADDRESSING ***.
    With this approach we do NOT store values is link lists, you store them directly in a sales or
    slots. we have hash table with five slots, and we want to store this key value pair.
    K = 6
    V = A
    since the key is 6, our hash function is going to return one. 6 % 5 = 1
    so we should store this key value pair at the slot whit index one.

    _0
    _1  6,A
    _2
    _3
    _4

    next we are going to store these other key value pair:
    K = 8
    V = B

     8 % 5 = 3   store at the slot whit index 3

    _0
    _1  6,A
    _2
    _3  8,B
    _4

    now what about this other key value pair?
    K = 11
    V = C

    is you pass this key to hash function will get one 11 % 5 = 1
    BUT there is already an item stored in this slot So we have collision
    Now to solve this we have to look for another EMPTY slot
    This is called *** PROBING *** (SEARCHING).

    we have to search for another location and this is the reason why this approach
    is called ****OPEN address***  because the address of a key value pair is not determined
    by the hash function. WE HAVE TO SEARCH FOR ANOTHER EMPTY SLOT.

    Now we have THREE searching or probing algorithms

    -The first one, which we are going to talk about now is *** LINEAR PROBING ***

    whit this algorithm, we start from a CURRENT slot, if it is full

    _0
    _1  6,A     <---
    _2
    _3  8,B
    _4


     _0
    _1  6,A
    _2          <---
    _3  8,B
    _4


    if it is full once again, we go forward until we find an empty slot.
    Now what if we can NOT find any empty slots. That means our table is full.
    And this is one of the drawbacks (disadvantage) of using the using open addressing strategy.

    With the changing strategy, we do not have this problem because our link lists
    can grow automatically.

    so in this example we should store this key value pair at index two.

    _0
    _1  6,A
    _2  11,C    <---
    _3  8,B
    _4

    Here is the formula for linear probing:
    Linear Probing: hash(key) + i

    we start with our hash value and then incrementally by one at each step.
    i --> like a loop variable that starts with zero and gets incremental until we find that.

    Now because we are incremental i in every step, it is possible that i ends up being outside
    the boundary of our array.
    so we should apply the % operator and reduce the result to range that can fit in the array.

    Now there is a problem with this linear probing.
    this three items stores next to each other, form a *** CLUSTER ***  (group , khoshee)
     _0
    _1  6,A  *
    _2  11,C *  this three items is CLUSTER
    _3  8,B  *
    _4

    next time we want to add a new key value pair where the key falls in this range,
    our probing is going to take longer, we have to pass all these items in the cluster
    and add a new item at the end of the cluster.

    _0
    _1  6,A  *
    _2  11,C *  Four items is CLUSTER
    _3  8,B  *
    _4  16,D *

    As a result, our cluster will get bigger and again, this will make
    future probing algorithms that attempt to solve this problem.
     */
}
