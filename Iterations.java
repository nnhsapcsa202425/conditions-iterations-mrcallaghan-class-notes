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
         * while loop
         * 
         *  evaluates a condition (i.e., boolean expression)
         *      if true, excutes the body of code in the loop and then re-evaluate the condtion
         *      if false, skips the body and continues program
         */
        
        int count = 1;              // initialization
        
        while (count <= 5)          // condition
        {
            System.out.println(count);      // body
            
            count++;                        // update the loop variable
        }
        
        System.out.println("done.");
        
    }
    
    public static void whileExample2()
    {
        int count = 1;
        
        /*
         * This is an example of an infinite loop!
         * 
         * A better condition would be <= 50.
         *  while (count <= 50)
         */
        while (count != 50)
        {
            System.out.println(count);
            
            count += 2;
        }
        
        System.out.println("done.");
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
