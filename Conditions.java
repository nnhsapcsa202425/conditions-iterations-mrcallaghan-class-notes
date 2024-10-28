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
    
    public static boolean doublesAreEqual(double num1, double num2)
    {
    
        /*
         * If we use the equality operator (==) for doubles, it will only return true if the binary digits
         *  match.
         *  
         *  For "equal numbers", this is probably not the case due to floating point rounding.
         *  
         *  Instead, we can check if they are "close enough", using an epsilon value.
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
        
        // don't have to use an if/else here
        //return (Math.abs(num1 - num2) < EPSILON);

    }
    
    public static void stringExample()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two words: ");
        String str1 = s.next();
        String str2 = s.next();
        
        /*
         * The equality operator (==) returns true if the two variables contain the same value.  For variables
         *  of a class type, including String, this means that contain the same reference.  That is, they
         *  refer to the same object in computer memory, NOT that they have the same characters.
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
         * The equals method returns true if the the two objects referenced by the variables
         *  are "equal".  What equal means is defined by the class.  For Strings, it means the two
         *  objects have the same sequence of characters.
         */
        if (str1.equals(str2))
        {
            System.out.println("The strings are equal (i.e., same character sequence).");
        }
        else
        {
            System.out.println("The strings are NOT equal (i.e., different character sequence).");
        }
        
        
        /*
         * If we want to check if strings are not equal, we can use the logical complement operator.
         *      (i.e., !)
         *      
         */
        if (! str1.equals(str2))
        {
            System.out.println("The Strings are NOT equal.");
        }
        
        
        /*
         * Will determine which string comes first lexicographically using the compareTo method of teh 
         *  String class
         *  
         *  compareTo returns an int:
         *      0:  the string are equal (same series of characters)
         *      <0: if str1 < str2 lexicographically
         *      >0: if str1 > str2 lexicographically
         */
        int result = str1.compareTo(str2);
        System.out.println("Result from str1.compareTo(str2): " + result);
        
        String firstStr = null;
        if (result < 0)
        {
            firstStr = str1;
        }
        else if (result > 0)
        {
            firstStr = str2;
        }

        if (firstStr != null)
        {
            System.out.println("The first string is: " + firstStr);
        }
        else
        {
            System.out.println("The strings are equal.");
        }
        
    }

}