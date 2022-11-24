package se.codewithMosh.elmira.hashTables;

import java.util.HashMap;
import java.util.Map;

public class Main {
    //Spell checkers
    //Dictionaries
    //Compilers  look at the address of functions and variables
    //Code editors

    /*
    Java -> HashMap
    JavaScript -> Objects
    Python -> Dictionary
    C# -> Dictionary


    Key    employeeNumber
    Value  employee

    employeeNUmber --------> HAshFunction ----------> address


    HashFunction is Deterministic which means every time we give it tha same input it will
    return the same value.
    (We use for both storing and retrieving objects)

    Operations supported by HashTables:
    Insert O(1)
    Lookup O(1)
    delete O(1)
     */

    public static void main(String[] args) {
        //Key: Employee Number (Integer)
        //Value: Name (String)
        Map<Integer, String> map = new HashMap<>(); //HshMap--> implementation of this interface
        map.put(1, "Mosh");
        map.put(2, "Elmira");
        map.put(3, "Negar");
        // map.put(3, "Noura");  //In hashMap we do NOT have duplicate keys
        //The previous value was overwritten with a new value.
        // map.put(4, null); //we can store null value in hash map
        // map.put(null, null); // null=null, null key  is ok and come before 1
        // map.remove(null);
        System.out.println(map);

        // var value = map.get(3);
        //System.out.println(value);

        //check the existence of a key or value
        // map.containsKey(3);  //O(1)
        //map.containsValue("Mosh");//O(n)


        //iterate over a hash map
        for(var item: map.entrySet())    // keySet() -> return a list of keys      entrySet() -> returns a list of key value pairs
            System.out.println(item);
    }
}
