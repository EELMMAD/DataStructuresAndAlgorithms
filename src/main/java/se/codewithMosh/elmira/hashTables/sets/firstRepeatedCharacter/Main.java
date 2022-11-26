package se.codewithMosh.elmira.hashTables.sets.firstRepeatedCharacter;

import se.codewithMosh.elmira.hashTables.fierstNonRepeatedCharacter.CharFinder;

public class Main {
    public static void main(String[] args) {
        //green apple
        CharFinder finder = new CharFinder();
        var ch = finder.findFirstRepeatedChar("green apple");
        System.out.println(ch);
    }
}
