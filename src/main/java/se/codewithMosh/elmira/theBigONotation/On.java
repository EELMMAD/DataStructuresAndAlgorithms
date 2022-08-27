package se.codewithMosh.elmira.theBigONotation;

public class On { //O(n)       n --> size of input
    //as n grows the cost of this algorithms grow linearly
    public void log(int[] numbers){
        //O(n) runtime complexity

        //traditional for loop
        for (int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        //enhance for loop
        for (int number : numbers){
            System.out.println(number);
        }
    }


    public void log2(int[] numbers, String[] names){
        //O(n)
        for(int number : numbers){
            System.out.println(number); //O(n)
        }

        for(String name : names){   //O(n)
            System.out.println(name);
        }
    }
}
