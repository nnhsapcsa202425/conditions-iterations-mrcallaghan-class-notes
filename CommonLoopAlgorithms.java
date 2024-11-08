import java.util.Scanner;

public class CommonLoopAlgorithms
{
    /*
     * Loop Algorithm #1: Count Matches for Length
     * reads a series of words (ends with "quit")
     * counts the number of words of length greater than four
     * @return the number of words of length greater than four
     */
    public static int countMatchesForLength()
    {
        Scanner s = new Scanner(System.in);
        int count = 0;
        String word = "";
        while(word.equals("quit") == false)
        {
            System.out.print("Enter words (when done type 'quit'): ");
            word = s.next();
            int length = word.length();
            if (length > 4)
            {
                count ++;
            }
        }

        return count;
    }

    /*
     * Loop Algorithm #2: Count Matches for Prefix
     * reads a series of words (ends with "quit")
     * counts the number of words that start with the substring "con"
     * @return the number of words  that start with the substring "con"
     */
    public static int countMatchesForPrefix()
    {
        return 0;
    }

    /*
     * Loop Algorithm #3: Count Matches for Suffix
     * reads a series of words (ends with "quit")
     * counts the number of words that end with the substring "est"
     * @return the number of words  that end with the substring "est"
     */
    public static int countMatchesForSuffix()
    {
        Scanner s = new Scanner(System.in);
        int estCounter = 0;
        while (true) {
            System.out.print("Enter a word. say 'quit' to quit the thingy ");
            String nextToken = s.next();
            if (nextToken.equals("quit")) {
                break;
            }
            if (nextToken.substring(nextToken.length() - 3, nextToken.length()).equals("est")) {
                estCounter += 1;
                System.out.println(estCounter);
            }
        }
        System.out.println("Count:  " + estCounter);
        return estCounter;
    }

    /*
     * Loop Algorithm #4: Reverse String
     * reads one word
     * reverses the characters in the word
     * @return a new string with the characters reversed
     */
    public static String reverseWord()
    {
        return "";
    }

    /*
     * Loop Algorithm #5: Compare Adjacent Words
     * reads a series of words until an adjacent duplicate word is entered
     * @return the number of unique words entered before the duplicate
     */
    public static int compareAdjacent()
    {
        return 0;
    }

    /*
     * Loop Algorithm #6: Prompting until Criteria Is Met
     * prompts the user to enter a word that is alphabetically after "north"
     *        and has more than six characters
     * continues to prompt the user until the word meets the criteria
     * @return the word that meets the criteria
     */
    public static String promptUntilMatch()
    {
        return "";
    }

    /*
     * Loop Algorithm #7: Addition with Strings (Extension)
     * Write an algorithm to identify the individual digits in a String and apply an addition operations, returning 
     *  the result.
     * For example, if the integer "123 + 123" is entered by a user, return 246.
     */
    public static double identifyDigits(String operation)
    {
        return 0.0;
    }
}