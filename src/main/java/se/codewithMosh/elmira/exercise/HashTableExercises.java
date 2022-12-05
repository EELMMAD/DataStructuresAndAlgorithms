package se.codewithMosh.elmira.exercise;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashTableExercises {
    static int[] ints = {1, 2, 2, 3, 3, 3, 4};

    public static void main(String[] args) {
        HashTableExercises hashTableExercises = new HashTableExercises();
        var result = hashTableExercises.mostFrequent(ints);
        System.out.println(result);
    }

      /* Q1:
        -Find the most repeated element in the array of integers.
        -What is the time complexity of this method?
        (A variation of this exercise is finding the most repeated word in the sentence.
        the algorithm is the same. Here we use an array of numbers for simplicity.)

        Input: [1, 2, 2, 3, 3, 3, 4]

        Output: 3
         */

    //Q1: O(n)
    public int mostFrequent(int[] numbers) {
        //To find the most frequent item in an array, we have to count the
        //number of times eac item has been repeated.
        // We can use a hash table to store the items and their frequencies.

        Map<Integer, Integer> map = new HashMap<>();
        for (var number : numbers) {
            var count = map.getOrDefault(number, 0);
            map.put(number, count + 1);
        }

        //Once we've populated our hash table, we need to iterate over all
        // Key/value pairs and find the one with the highest frequency.
        int max = -1;
        int result = numbers[0];
        for (var item : map.entrySet()) {
            if (item.getValue() > max) {
                max = item.getValue();
                result = item.getValue();
            }
        }
        //Runtime complexity of this method is O(n) because we have to
        //iterate the entire array to populate our hash table.

        return result;
    }
}
