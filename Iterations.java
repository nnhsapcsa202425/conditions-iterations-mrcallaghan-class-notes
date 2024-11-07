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
    
    
    public static void forExample()
    {
        /*
         * for loop:
         * 
         *      Three part to the for statement:
         *        1. initialization - executed once
         *        2. condition - boolean expression evaluated at the start of each iteration
         *        3. update of the loop variable - executed at the end of each iteration before reevaluating the condition
         */
        
        // most common style
        for (int count = 1; count <= 5; count++)
        {
            // loop body
        }
        
        // style most useful for debugging
        for (int count = 1;     // initialization
                 count <= 5;    // condition
                 count++)       // update of the loop variable
        {
            System.out.println("count: " + count);
        }
        
        System.out.println("done.");
        /*
         * Variables declared within the for statement are scoped to the for statement and it body.
         */
        //System.out.println("Count: " + count);
    }
    
    public static void offByOne()
    {
        /*
         * The infamous off-by-one error; common error with for loops executing one too many or too few times.
         * 
         *      Carefully ask:  Should the initial value be 0 or 1
         *                      Should the condition be inclusive or exclusive (<, <=)
         *                      
         * By convention, simple for loops start at 0 and are exclusive (<).  'i' is a common loop variable name.
         */
        for (int count = 0;     // initialization
                 count <= 5;    // condition
                 count++)       // update of the loop variable
        {
            // intends to print 5 asterisks
            System.out.println("*");
        }
        
        System.out.println("done.");
    }
    
    public static void doExample()
    {
        /*
         * do loop (do-while loop)
         * 
         *      1. executes the body of the loop
         *      2. evaluate the condition
         *              if true, executes the body of the loop agian
         *              if false, continue execution after the loop
         */
        
        int count = 1;
        
        do 
        {
            System.out.println(count);
            
            count++;
        }
        while (count <= 5);
        
        System.out.println("done.");
    }
    
    public static int sum()
    {
        int sum = 0;
        int value;
        
        Scanner s = new Scanner(System.in);
        
        do
        {
            System.out.print("Enter a positive integer (-1 to quit): ");
            
            /*
             * Sentinel value / variable
             *   value (e.g., -1) used to terminate a loop.
             *   often entered by a user.
             */
            value = s.nextInt();
            
            if (value != -1)
            {
                sum += value;
            }
        }
        while (value != -1);
        return sum;
    }
    
    public static int sumWithBreak()
    {
        int sum = 0;
        int value;
        
        Scanner s = new Scanner(System.in);
        
        do
        {
            System.out.print("Enter a positive integer (-1 to quit): ");

            value = s.nextInt();
            
            if (value == -1)
            {
                /*
                 * break: immediately exit the innermost loop
                 */
                break;
            }
            
            sum += value;
        }
        while (value != -1);
        
        return sum;
    }
    
    public static int sumWithContinue()
    {
        int sum = 0;
        int value = 0;
        
        Scanner s = new Scanner(System.in);
        
        do
        {
            System.out.print("Enter a positive integer (-1 to quit): ");
            
            /*
             * The hasNextInt method of the Scanner calss returns true if the next token in the input stream is an integer;
             *  otherwise it returns false.  It does not consume the next token.  If there are no tokens to read, it will
             *  wait for one to be entered.
             */
            if(s.hasNextInt() == false)
            {
                System.out.println("" + s.next() + "is not an integer; try again.");
                
                /*
                 * continue:
                 *  1. immediately skips the rest of the loop body
                 *  2. re-evaluates the loop condition and continues with the next iteration if true
                 */
                continue;
            }

            value = s.nextInt();
            
            if (value == -1)
            {
                /*
                 * break: immediately exit the innermost loop
                 */
                break;
            }
            
            sum += value;
        }
        while (value != -1);
        
        return sum;
    }
    
    
    
    
    
    
    
    
    
    

}
