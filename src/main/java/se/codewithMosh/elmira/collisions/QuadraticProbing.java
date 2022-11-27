package se.codewithMosh.elmira.collisions;

public class QuadraticProbing {
    /*
    cluster -> linear probing algorithms
    As we know clusters reduce the performance.
    to solve this problem we can use QUADRATIC PROBING

    Quadratic _ Quad (Squared)

    Linear                            Quadratic
    hash(key) + i                     hash(key) + i^2

                1                                 1
                2                                 4
                3                                 9
                4                                 16
                5                                 25

   in linear new key value pair get stored next to each other in a form of cluster
   but in quadratic our key value pairs  will spread out more widely.

   (hash(key) + i)^2 % table_size


   we have big jumps is quadratic probing, Infinite loop

     */
}
