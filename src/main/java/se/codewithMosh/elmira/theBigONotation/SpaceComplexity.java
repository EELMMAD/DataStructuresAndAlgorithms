package se.codewithMosh.elmira.theBigONotation;

public class SpaceComplexity {

    //Loop is independent of the size of the input
    public void greet(String[] name){
        //O(1) space
        for(int i = 0; i < name.length; i++){
            System.out.println("Hi " + name[i]);
        }

        //O(n) space
        String[] copy = new String[name.length];
    }
}
