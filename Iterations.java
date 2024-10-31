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
         *      if true, executes the body of the loop and then re-evaluates the condition
         *      if false, skips the body, ending the loop, and continue regular program flow
         */
        
        int count = 1;              // initialization
        
        while (count <= 5)           // condition
        {
            
            System.out.println(count);      // body
            
            count++;                        // update the loop variable
            // equivalent to: count += 1

        }
        
        System.out.println("done.");
        // what is count here?
        System.out.println(count);
        
    }
    
    public static void whileExample2()
    {
        int count = 1;
        
        /*
         * infinite loop!
         * 
         * This programmer may have meant:
         *      while (count <= 50)
         */
        while (count != 50)
        {
            System.out.println(count);
            
            count += 2;
        }
        
        System.out.println("done.");
    }
    
    
    
    
    
    
    
    
    
    
    
    
}
