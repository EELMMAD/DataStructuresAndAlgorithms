package se.codewithMosh.elmira.hashTables.hashFunctions.Main;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
     /*
        //Hash function is a function that gets a value and maps
        // it to a different kind of value which we call a hash value,

        //In the context of data structures, a hash function maps a key value to an index value
        Map<Integer, String> map = new HashMap<>();

        /*
        map.put(1, "Mosh");
        // items[1] = "Mosh";
        // if we have 100 items
        //our indexes -> 0 - 99
         */
/*
        map.put(123456, "Mosh");
        System.out.println(hash(123456));


        //What is our key is the string? how we divide it?
        Map<String, String> mapII = new HashMap<>();
        mapII.put("123456-A", "Mosh");  //How can we convert to an index?
        //every character in computer is represented by a number internally
        //So we can get the nu,eric representation of each character, add them all together , now we have a big number
        System.out.println(hashString("123456-A"));
    */

    String str = "orange";
        System.out.println(str.hashCode());
    }

    public static int hash(int number){
         return number % 100;  //100 is the size of hash table or internal array
    }

    public static int hashString(String key){
        //In java every object has a method name hashCode()
        String s = "";
        s.hashCode();

        int hash = 0;
        for(var ch: key.toCharArray())
            hash += ch;  //augmented assignment operator +=  between the character and integer ,
                         // this character automatically converted to an integer, this is what we call implicit casting
        return hash % 100;    //at which index we should store this employee
    }
}
