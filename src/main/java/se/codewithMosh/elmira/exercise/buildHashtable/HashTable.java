package se.codewithMosh.elmira.exercise.buildHashtable;

import java.util.LinkedList;

public class HashTable {
    private class Entry {
        private int key;
        private String value;

        public Entry(int key, String value) {
            this.key = key;
            this.value = value;
        }
    }

    private LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value) {
        var index = hash(key);
        if (entries[index] == null) {
            entries[index] = new LinkedList<>();

            //if someone passes a duplicate key with this implementation will end up adding
            //a duplicate entry in this linked list, so instead of always adding the entry
            // at the end of this link, first we should iterate over this linked list,
            //look at every entry, if you find an entry with the same key, you want to
            // update its value, Otherwise we want to append this entry at the end of our list
            var bucket = entries[index];
            for (var entry : bucket) {
                if (entry.key == key) {
                    entry.value = value;
                    //here we want to return because we do not want to add a new
                    // entry at the end of this bucket
                    return;
                }
            }
            bucket.addLast( new Entry(key, value));
        }
    }

    //where is entries we should store the key value pair
    private int hash(int key) {
        return key % entries.length;
    }
}
