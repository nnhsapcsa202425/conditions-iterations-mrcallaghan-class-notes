import java.util.Scanner;

/**
 * Examples and notes on conditions (Chapter 5)
 *
 * @author mcallaghan
 * @version 21oct2024
 */
public class Conditions
{
    public static void ifExample()
    {
        // model a coin flip; 1: heads, 0: tails
        int coinFlip = (int) (Math.random() * 2); // Math.random() returns 0.0 - 0.9999
        
        /*
         * If statement
         * 
         * Statements in the if block are executed if the condtion is true.
         * 
         * Conditional expressions evaluate to either true or false.
         *  The conditional expression must go inside the parentheses.
         *  (Unlike Python, there is no colon after the expression)
         *  
         *  Statments are grouped by curly brackets, or blocks (i.e., { } ).
         *      (unlike Python, blocks are not defined by indentation)
         */
        
        // simple if statement
        if (coinFlip == 1)  // block runs if true; skips block if false
        {
            System.out.println("coin is heads!");
        }
        
        
        /*
         * if, else statement
         * 
         * The else block is executed if the conditional expression is false
         */
        // if - else statment
        if (coinFlip == 1)
        {
            System.out.println("coin is heads!");
        }
        else
        {
            System.out.println("coin is tails!");
            System.out.println("better luck next time...");
        }
        
        // model the roll of a four-sided die [ 1 - 4 ]
        int dieRoll = (int) ((Math.random() * 4) + 1);
        
        
        /*
         * if, else-if, else statement
         * 
         * (Unlike in python, Java uses "else if" instead of "elif")
         */
        
        if (dieRoll == 1)
        {
            System.out.println("you rolled a 1");
        }
        else if (dieRoll == 2)
        {
            System.out.println("you rolled a 2");
        }
        else if (dieRoll == 3)
        {
            System.out.println("you rolled a 3");
        }
        else
        {
            System.out.println("you rolled a 4");
        }
        
        /*
         * { } are not required for single statements, however they are always a good idea.
         *      Leaving them out can lead to weird bugs, like this:
         */
        if (coinFlip == 0)
            System.out.println("coin is heads");
            System.out.println("better luck next time...");

        
    }
}
