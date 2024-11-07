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
        return 0;
    }

    /*
     * Loop Algorithm #2: Count Matches for Prefix
     * reads a series of words (ends with "quit")
     * counts the number of words that start with the substring "con"
     * @return the number of words  that start with the substring "con"
     */
    public static int countMatchesForPrefix()
    {
        Scanner s = new Scanner(System.in);

        String word = "";
        int wordsStartingWithCon = 0;

        do
        {
            System.out.print("Enter word at least 3 letters: ");
            word = s.next();

            if (word.equals("quit"))
            {
                break;
            }

            if (word.length() < 3)
            {
                System.out.println(word + " is not at least 3 letters. Enter a word at least 3 letters");
                continue;
            }

            if (word.substring(0, 3).equals("con"))
            {
                wordsStartingWithCon++;
            }

        }
        while (!word.equals("quit"));

        return wordsStartingWithCon;
    }

    /*
     * Loop Algorithm #3: Count Matches for Suffix
     * reads a series of words (ends with "quit")
     * counts the number of words that end with the substring "est"
     * @return the number of words  that end with the substring "est"
     */
    public static int countMatchesForSuffix()
    {
        Scanner scanner = new Scanner(System.in);
        int count = 0;

        System.out.println("Enter words (type 'quit' to stop):");

        while (true) {
            String word = scanner.nextLine();
            if (word.equals("quit")) {
                break;
            }
            if (word.endsWith("est")) {
                count++;
            }
        }

        scanner.close();
        System.out.println("Words that end with est:");
        return count;
    }

    /*
     * Loop Algorithm #4: Reverse String
     * reads one word
     * reverses the characters in the word
     * @return a new string with the characters reversed
     */
    public static String reverseWord()
    {
        Scanner s = new Scanner(System.in);
        System.out.print("enter string: ");
        String str = s.next();
        String newstr = "";

        for (int i = 0; i < str.length(); i++){
            newstr = newstr + str.substring(str.length() - 1 - i, str.length() - i);
        }

        return newstr;
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
     * Loop Algorithm #7: Identify Individual Digits in an Integer (Extension)
     * Write an algorithm to identify the individual digits in an integer.
     * For example, if the integer 123456 is entered by a user, print each digit
     * on its own line (right-most digit first).
     */
    public static void identifyDigits(int intValue)
    {
    }
}