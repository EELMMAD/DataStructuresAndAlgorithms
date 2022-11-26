package se.codewithMosh.elmira.hashTables.sets;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Maps: key -> values
        // Sets: key   (sets ONLY have keys NOT values) (Sets do not allow duplicate keys)

        //[1, 2, 3, 3, 2, 1, 4, 5]  we want to remove the duplicates
        // all we have to do is to get each item and add it to a set
        //because sets do not allow duplicates

        Set<Integer> set = new HashSet<>();
        int[] numbers = {1, 2, 3, 3, 2, 1, 4};
        for(var number : numbers)
            set.add(number);
        System.out.println(set);
    }
}
