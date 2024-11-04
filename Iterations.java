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
    
    
    public static void forExample()
    {
        /*
         * for loop:
         * 
         *  Three part to the for statment:
         *      1. initialization - executed once
         *      2. condition - evaluated at the start of each iteration
         *      3. update of the loop variable - executed at the end of each iteration
         */
        
        
        // useful style for debugging, but less common
        for (int count = 1;             // initiailization
                 count <= 5;            // condition
                 count++)               // update loop variable
        {
            System.out.println("count: " + count);
            int local = 0;
        }
        
        System.out.println("done.");
        /*
         * Variables declared within the for statment or for loop are scoped to the for loop
         */
        //System.out.println(count);
        //System.out.println(local);
        
        // more common style, all on one line
        for (int count = 1; count <= 5; count++)   
        {
            System.out.println("count: " + count);
        }
    }
    
    
    
    
    
    
    
    
    public static void forExample2()
    {
        
        /*
         * The infamous off-by-one error is common with for loops incrementing one too many or one too few times.
         * 
         * Carfully ask:
         *      - Should the intial value start at 1 or 0?
         *      - Should the condition be inclusive or exclusive (<, <=)?
         */
        int i = 0;
        for (   ;
             i <= 5;
             i++)
        {
            // intent is to print 5 plus signs
            System.out.println("+");
        }
        
        System.out.println("done.");
    }
    
    
    
    
    
    
    
}
