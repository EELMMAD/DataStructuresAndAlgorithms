package se.codewithMosh.elmira.theBigONotation.stacks.balancedExpressions;

public class Main {
    public static void main(String[] args) {
        //Edge cases
        // (
        // (()
        // ) (

        String str = ")1 + 2(";
        Expression exp = new Expression();
        var result = exp.isBalanced(str);
        System.out.println(result);
    }
}
