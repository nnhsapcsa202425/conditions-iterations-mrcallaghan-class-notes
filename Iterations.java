import java.util.Scanner;


/**
 * Examples and notes on iterations (Chapter 6)
 *
 * @author mcallaghan
 * @version 31oct2024
 */
public class Iterations
{
    public static void whileExample()
    {
        /*
         * while loop:
         * 
         *      evaluates a condition (i.e., a boolean expression)
         *          if true, executes the body of the loop and then re-evaluates the condition
         *          if false, skips the body of the loop and continues afterwards
         */
        
        int count = 1;          // initialization
        
        while (count <= 5)      // condition
        {
            System.out.println(count);      // body
            
            //count += 1;
            count++;  // equivalent to count += 1  // updating the loop variable
            
            
        }
        
        System.out.println("Done.");
        
        // What is count at this point in the program?
        System.out.println(count);
    }
    
    public static void whileExample2()
    {
        int count = 1;
        
        /*
         * This is an example of an infinite loop!
         * 
         * A better condition would be:
         *      while (count < 50)
         */
        while (count != 50)
        {
            System.out.println(count);
            
            count += 2;
        }
        
        System.out.println("done.");
    }
    
    
    
    
    
    
    
    
}
