package se.codewithMosh.elmira.theBigONotation.theBogONotation;

public class OnToPowerOfTwo { //O(n ^2)   O(n * n)
    //nested loop
    //printing all combinations of items in an array

    public void log(int[] numbers){
        //O(n ^ 2)  runtime complexity

        for(int number : numbers)
            System.out.println(number); //O(n)
        for (int first : numbers) //O(n)
            for(int second : numbers) //O(n)
                System.out.println(first + ", " + second);
    }

    public void log1(int[] numbers){
        //O(n ^ 3)  runtime complexity   (grow much more slow)

        for (int first : numbers) //O(n)
            for(int second : numbers) //O(n)
                for (int third : numbers) { //O(n)
                    System.out.println(first + ", " + second + ", " + third);
                }
    }
}
