
/**
 * Write a description of class Diamond here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Diamond
{
    public static void sampleMethod()
    {
        int num = 4;
        int stars = num * 2 -1;
        for (int i = num - 1; i >= 0 ; i--)
        {
            //System.out.println("Loop #: " + i);
            for (int space = i; space > 0; space--)
            {
                System.out.print("_");
            }
            
            for (int star = stars; star < num * 2; star+=1)
            {
                System.out.print("*");
            }
            stars -= 2;
            System.out.println();
        }
    }
}
