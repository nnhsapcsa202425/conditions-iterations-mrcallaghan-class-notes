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
    
    
    public static void forExample()
    {
        /*
         * for loop:
         * 
         *   Three parts of the for statement.
         *      1. initialization = executed once
         *      2. condition = boolean expression evaluated at the start of the loop[ and each iteration
         *      3. update the loop variable = executed at the "end" of each iteration (before the condition is reevaluated)
         */
        
        
        for (int count = 1;     // intialization
             count <= 5;        // condition
             count++)           // update the loop variable
        {
            System.out.println(count);  // body
        }
        
        System.out.println("done.");
        
        /*
         * variables declared withing the scope of the for statement are scoped to the statement and the loop body.
         */
        //System.out.println("the final value of count is: " + count);
    }
    
    public static void offByOne()
    {
        /*
         * The infamous off-by-one error is common with for loops
         *      executing one too many times or one too few.
         *      
         *      Carefully ask: Should the initial value be 1 or 0
         *                     Should the condition be < or <=
         *                     
         *      By convention, for simple for loops, we start at 0 and end using the < operator.
         */
        for (int i = 0;   // initialization to 1 or 0?
                 i <= 5;  // condition inclusive or exclusive?
                 i++)
        {
            System.out.println("*");
        }
        
        System.out.println("done.");
    }
    
    
    
    
    
    
    
}
