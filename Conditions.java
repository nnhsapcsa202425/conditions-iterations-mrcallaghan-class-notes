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
    
    public static boolean doublesAreEqual(double num1, double num2)
    {
        /*
         * Be careful using the equality operator (i.e., ==) with doubles.  It's checking if all binary digits
         * match, and due to floating point arithmetic and rounding, it may not give us what we want.
         * 
         * Instead, check if doubles are "close enough" using a epsilon value.
         */
        
        final double EPSILON = 1e-6;
        
        if (Math.abs(num1 - num2) < EPSILON)
        {
            return true;
        }
        else
        {
            return false;
        }
        
        // don't have to use the if/else here
        //return Math.abs(num1 - num2) < EPSILON;
    }
    
    public static void stringExample()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two words (with a space inbetween words): ");
        String str1 = s.next();
        String str2 = s.next();
        
        /*
         * The equality operator (==) returns true if the object references are equal. In other words,
         *  the objects store the same location in computer memory.  This is not the same as the same 
         *  sequence of characters.
         */
        if (str1 == str2)
        {
            System.out.println("The string references are equal.");
        }
        else
        {
            System.out.println("The string references are NOT equal.");
        }
        
        /*
         * The equals method return true if the two objects referenced by the variables are "equal".
         *      What "equal" means gets determined by the class.  For Strings, equeality means the Strings
         *      contain the same sequence of characters.
         *  
         */
        if (str1.equals(str2))
        {
            System.out.println("The strings are equal (same sequence of characters).");
        }
        else
        {
            System.out.println("The strings NOT are equal (different sequence of characters).");
        }
        
        /*
         * If we want to check if strigns are not equal, we can use the logical complement operator (i.e., !)
         */
        if (! str1.equals(str2))
        {
            System.out.println("The strings are NOT equal.");
        }
        
        
        
        
    }
}
