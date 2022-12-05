package se.codewithMosh.elmira.exercise;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashTableExercises {
    static int[] ints = {1, 2, 2, 3, 3, 3, 4};

    static int[] intsQ2 = {1, 7, 5, 9, 12, 3};

    public static void main(String[] args) {
        HashTableExercises hashTableExercises = new HashTableExercises();
        var result = hashTableExercises.mostFrequent(ints);
        System.out.println(result);


        var resultQ2 = hashTableExercises.countPairsWithDiff(intsQ2, 2);
        System.out.println(resultQ2);
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

    /*
    Q2:
    Given an array of integers, count the number of unique pairs of
    integers that have difference k.

    Input: {1, 7, 5, 9, 12, 3} k=2
    Output: 4

    We have four pairs with difference 2: (1,3),(3,5),(5,7),(7,9).
    Note that we only want the number of these pairs, not the pairs themselves.
     */

    //O(n)
    public int countPairsWithDiff(int[] numbers, int difference) {
        //For a given number (a) and difference (diff), number (b) can be:
        //
        // b = a + diff
        // b = a - diff
        //
        // We can iterate over array of numbers, and for each number,
        //Check to see if we have (current + diff) or (current - diff).
        //But looking up items in an array is an O(n) operation.
        //With this algorithm, we need two nested loops(one to pick a, and the other to find b.)
        //This will be an O(n ^ 2) operation.
        //We can optimize this by using a set. Sets are like hash tables, but the only store keys.
        //we can look up a number in constant time.
        //No need to iterate the array to find it.

        //So we start by adding all the numbers to a set for quick look up.
        Set<Integer> set = new HashSet<>();
        for (var number : numbers)
            set.add(number);

        //Now we iterate over the array of numbers one more time,
        //and for each number check to see if we have (a + diff) or (a - diff) in our set
        //
        //Once we are done, we should remove this number from our set.
        //so we do NOT double count it.

        var count = 0;
        for (var number : numbers) {
            if (set.contains(number + difference))
                count++;
            if (set.contains(number - difference))
                count++;
            set.remove(number);
        }
        //Time complexity of this method is O(n).

        return count;
    }
}
