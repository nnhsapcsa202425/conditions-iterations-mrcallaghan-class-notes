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
        // model a coin flip; 1 = heads; 0 = tails
        int coinFlip = (int) (Math.random() * 2); // Math.random() produces a double 0.0 to 0.9999
        
        /*
         * if statement
         * 
         * Statments in the if block are executed if the consitional expression is true.
         * 
         * Conditional expressions evaluate to either true or false.
         *  The conditional expression must go inside the parentheses.
         *  (unlike python, there is no colon after the expression)
         *  
         *  Statements are grouped by blocks  (i.e., { } ).
         *    (unlike python, blocks are not defined by indentation)
         */
        
        // simple if example
        if (coinFlip == 1)  // run block if true; don't if false
        {
            System.out.println("coin is heads!");
        }
        
        /*
         * if, else statement
         * 
         * The else block is executed if the prior conditional expression(s) are false.
         */
        // if - else example
        if (coinFlip == 1)
        {
            System.out.println("coin is heads!");
        }
        else
        {
            System.out.println("coin is tails!");
        }
        
        // model the roll of four-sided die [1 - 4]
        int dieRoll = (int) (Math.random() * 4) + 1;
        
        /*
         * if, else if, else statment
         * 
         * (unlke python, Java uses the "else if" instead of "elif")
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
         * { } are not required for a single statment.  However, they are a good idea!
         *      Leaving them out could result in bugs like this:
         */
        
        if (coinFlip == 0)
            System.out.println("coin is tails!");
            System.out.println("...better luck next time");
            
            
    }
}
