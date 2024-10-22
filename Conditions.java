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
        int coinFlip = (int) (Math.random() * 2 );  // Math.random() returns 0.0 - 0.9999
        
        /*
         * If statment
         * 
         * Statements in the if block are executed if the condition is true.
         * 
         * Conditional expressions evaluate to either true or false.
         *  The condtional expressions must go inside the parentheses.
         *      (Unlike Python, there is no colon after the expression)
         *  
         *  Statements are grouped by blocks (i.e., { } ).
         *      (Unlike Python, blocks are not defined by indentation)
         */
        if (coinFlip == 1)
        {
            System.out.println("coin is heads!");
        }
        
        /*
         * if, else statement
         * 
         * The else block is executed if the conditonal expression is false.
         */
        if (coinFlip == 1)
        {
            System.out.println("coin is heads!");
        }
        else
        {
            System.out.println("coin is tails!");
        }
        
        /*
         * if, else if, else statement
         * 
         * (unlike Python, Java uses "else if" instead  of "elif")
         */
        
        // make a four sided die roll [1 - 4]
        int dieRoll = (int) (Math.random() * 4) + 1;
        
        if (dieRoll == 1)
        {
            System.out.println("rolled a 1");
        }
        else if (dieRoll == 2)
        {
            System.out.println("rolled a 2");
        }
        else if (dieRoll == 3)
        {
            System.out.println("rolled a 3");
        }
        else
        {
            System.out.println("rolled a 4");
        }
        
        /*
         * { } are not required for a single statement, however they are a good idea.
         *    Leaving them out, it can lead to bugs like this:
         */
        if (coinFlip == 0)
            System.out.println("Coin is tails still!");
            System.out.println("better luck next time...");
        

    }
    
    public static boolean doublesAreEqual(double num1, double num2)
    {
        final double EPSILON = 1e-6;
        
        if (Math.abs(num1 - num2) < EPSILON)
        {
            return true;
        }
        else
        {
            return false;
        }
        
        // don't have to use the if /else
        //return (Math.abs(num1 - num2) < EPSILON);
    
    }
}
