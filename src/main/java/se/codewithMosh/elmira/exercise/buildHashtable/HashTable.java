package se.codewithMosh.elmira.exercise.buildHashtable;

import java.util.Arrays;
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
        if (entries[index] == null)                        //  entries[index] ---> array cell
            entries[index] = new LinkedList<>();

        // if it is not null it means we have at least one entry in this link list
        //So we should add a new key value pair or a new entry at the end of this list
        //First we should wrap this key value pair en an entry object

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
        //here means we can not find the entry with the same key
        bucket.addLast(new Entry(key, value));
    }

    public String get(int key){
     var index = hash(key);
     var bucket = entries[index];
     if(bucket != null) {
         for (var entry : bucket)
             if (entry.key == key) {
                 return entry.value;
             }
     }
     return null;
    }

    private int hash(int key) {      //In which index we should put key value pair
        return key % entries.length;
    }
}



    /*


    private LinkedList<Entry>[] entries = new LinkedList[5];

    public void put(int key, String value) {
        var index = hash(key);
        if (entries[index] == null) {
            entries[index] = new LinkedList<>();


            var bucket = entries[index];
            for (var entry : bucket) {
                if (entry.key == key) {
                    entry.value = value;

                    return;
                }
            }
            bucket.addLast(new Entry(key, value));
        }
    }

    public String get(int key) {
        var index = hash(key);
        var bucket = entries[index];
        if (bucket != null) {
            for (var entry : bucket)
                if (entry.key == key)
                    return entry.value;
        }
        return null;
    }

    public void remove(int key) {
        var entry = getEntry(key);
        if(entry == null)
            throw new IllegalStateException();
        /*
        var index = hash(key);
        var bucket = entries[index];
        if (bucket == null)
            throw new IllegalStateException();

        for (var entry : bucket) {
            if (entry.key == key) {
                bucket.remove(entry);
                return;
            }
        }
        throw new IllegalStateException();

         */
    //  }

    /*
    private Entry getEntry(int key) {
        var index = hash(key);
        var bucket = entries[index];
        if (bucket != null) {
            for (var entry : bucket) {
                if (entry.key == key)
                    return entry;
            }
        }
        return null;
    }

    //where is entries we should store the key value pair
    private int hash(int key) {
        return key % entries.length;
    }

     */

