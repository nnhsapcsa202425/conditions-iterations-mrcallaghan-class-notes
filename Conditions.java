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
    
    public static void stringExample()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter two words: ");
        String str1 = s.next();
        String str2 = s.next();
        
        /*
         * The equality operator (==) returns true if the htwo variables (e.g., str1 and str2)
         *  contain the same value.  For variables of a class type, includeing strings,
         *  this means is that they must contain the same reference to be equal.  That is, they refer
         *  to the same object in memeory, not that the two string have the same sequence of characters.
         */
        if(str1 == str2)
        {
            System.out.println("The string references are equal.");
        }
        else
        {
            System.out.println("The string references are not equal.");
        }
        
        /*
         * The equals method returns true if teh two objects referenced by the variables are
         *  "equal".  What "equal" means is defined by the String class.  For Strings,
         *  it means they have the same sequence of characters.
         */
        if(str1.equals(str2))
        {
            System.out.println("The strings are equal (same sequence of characters).");
        }
        else
        {
            System.out.println("The strings are not equal.");
        }
        
        /*
         * If we want to check if the strings are not equal, we can use the logical complement operator
         *  (e.g., !)
         */
        if (! str1.equals(str2))
        {
            System.out.println("Strings are NOT equal.");
        }
        
        /*
         * We will determine which string comes first lexographically using the compareTo method of the
         *  String class.
         *  
         *  compareTo returns an int:
         *      0:   if the strings are equal (the sequence of characters)
         *      <0:  if str1 < str2 lexigraphically
         *      >0:  if  str1 > str2 lexigraphically
         */
        int result = str1.compareTo(str2);
        System.out.println("Result of compareTo: " + result);
        
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
            System.out.println("The first string is " + firstStr);
        }
        else
        {
            System.out.println("The strings are equal.");
        }
        
        /*
         * This is an example of a "short circuit".
         * 
         * For an AND operation, if the left operand is false, the right operand will
         *  not be evaluated.  This is because we have already determined the AND operation will be false.
         */
        if (firstStr != null && firstStr.length() > 3)
        {
            System.out.println("The first string has more than three characters.");
        }
        
        /*
         * This is another short circuit example.
         * 
         * For an OR operation, if the left operand is true, the right operand will not be evaluated.  This is
         *  because we have already determined the OR operation will be false.
         *  
         *  This results in a bug if the first fruit is "kiwi".
         */
        System.out.print("Enter your two favorite fruits: ");
        if (s.next().equals("kiwi") || s.next().equals("kiwi"))
        {
            System.out.println("Yum! Kiwis!");
        }
        
        System.out.print("Enter you favorite ice cream flavor: ");
        String flavor = s.next();
        System.out.println("Favorite ice cream flavor is " + flavor);
    }
    
    /*
     * 1) word1 is lexicographically greater than "aaa"
       2) word1 is lexicographically equal to word2
       3) word1 is lexicographically less than word2
       4) word1 and word2 have the same three-letter prefix    
     */
    public static void stringCompare()
    {
        String word1 = "catalog";
        String word2 = "cat";
        
        if(word1.compareTo("aaa") > 0)
        {
            System.out.println("condition #1 is true");
        }
        else
        {
            System.out.println("condition #1 is false");
        }
        
        if(word1.equals(word2))
        // if(word1.compareTo(word2) == 0)
        {
            System.out.println("condition #2 is true");
        }
        else
        {
            System.out.println("condition #2 is false");
        }
        
        if(word1.compareTo(word2) < 0)
        {
            System.out.println("condition #3 is true");
        }
        else
        {
            System.out.println("condition #3 is false");
        }
        
        if(word1.substring(0, 3).equals(word2.substring(0, 3)))
        //if (word1.substring(0, 3).compareTo(word2.substring(0, 3) == 0))
        {
            System.out.println("condition #4 is true");
        }
        else
        {
            System.out.println("condition #4 is false");
        }
    }

}
