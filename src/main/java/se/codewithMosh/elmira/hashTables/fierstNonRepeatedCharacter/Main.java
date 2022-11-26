package se.codewithMosh.elmira.hashTables.fierstNonRepeatedCharacter;

public class Main {
    public static void main(String[] args) {
        //String ---> a green apple ---> G is first NON repeated character in the string
        // a=2
        // white spac= 2
        //g=1

        CharFinder finder = new CharFinder();
        var ch = finder.findFirstNonRepeatingChar("a green apple");
        System.out.println(ch);
    }
}
