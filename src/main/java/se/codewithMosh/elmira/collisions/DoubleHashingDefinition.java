package se.codewithMosh.elmira.collisions;

public class DoubleHashingDefinition {
    /*
    DOUBLE HASHING:  separate independent hash function to calculate number of steps

    hash2(key) = prime - (key % prime)
    (hash1(key) + i * hash2(key)) % table - size
                  ---------------
                  linear: i
                  Quadratic: i^2
                  Double: i * hash2

      index(hash1 + i * hash2) % size

_____________________________________________________________________
_0             hash1(key) = key % table_size
_1
_2             hash2(key) = prime - (key % prime)    -->  hash2(key) = 3 - (key % 3)
_3
_4             index(hash1 + i * hash2) % size


prime -> must be prime number smaller than table size

K = 6,  V = A       6 % 5 = 1
K = 8,  V = B       8 % 5 = 3

K = 11  V = C       11 % 5 = 1
we already have an idea at this location, So we have a collision.
and that means we should prob for an empty slot.

Previously, when using linear probing, we just looked at the falling slot.
With quadratic probing, we use i 's square to make big jumps with double hashing.
use i times the second hash.    i * hash2,


  hash2(key) = prime - (key % prime)
  hash2(11) = 3 - (11 % 3)  = 1

  index = (hash1 + i*hash2) % size
  index =  (1 + 1*1) % 5 = 2

_0
_1  6,A
_2  11,C
_3  8,B
_4
     */
}
