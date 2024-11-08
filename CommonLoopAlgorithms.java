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
        String prefix = "con";
        int count = 0;
        Scanner s = new Scanner(System.in);
        String word = "";
        do
        {
            System.out.print("Enter a word to be tested: (quit to exit)");
            if (s.hasNextLine() == false)
            {
                System.out.println("" + s.next() + "is not a word. try again.");
                continue;
            }
            word = s.nextLine();
            if (word.length() <= 2)
            {
                System.out.println("" + word + " is not long enough. try again.");
                continue;
            }
            if (word.substring(0,3).equals(prefix))
            {
                count++;
            }
        } while (! word.equals("quit"));
        return count;
    }

    /*
     * Loop Algorithm #3: Count Matches for Suffix
     * reads a series of words (ends with "quit")
     * counts the number of words that end with the substring "est"
     * @return the number of words  that end with the substring "est"
     */
    public static int countMatchesForSuffix()
    {
        int count = 0;
        String word = "";

        Scanner s = new Scanner(System.in);

        do
        {
            System.out.print("Enter a word: ");
            word = s.next();
            if (word.length() < 3)
            {
                continue;
            }

            else if ((word.substring(word.length() - 3).equals("est")))
            {
                count++;
            }
        }
        while (!(word.equals("quit")));

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
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a word with no spaces: ");
        String word = in.nextLine();

        String returnString = "";
        for(int i = word.length() - 1; i >= 0; i--)
        {
            String character = word.substring(i,i+1);
            returnString = returnString + character;
        }
        System.out.println("");
        System.out.println(returnString);
        return returnString;
    }

    /*
     * Loop Algorithm #5: Compare Adjacent Words
     * reads a series of words until an adjacent duplicate word is entered
     * @return the number of unique words entered before the duplicate
     */
    public static int compareAdjacent()
    {
        String previousWord = "";
        String currentWord;

        int count = 0;

        Scanner s = new Scanner(System.in);

        while (true){
            System.out.print("Enter a word: ");
            currentWord = s.nextLine();

            if (currentWord.equals(previousWord)) {
                break;
            }

            previousWord = currentWord;
            count++;
        }

        return count;

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

        Scanner s = new Scanner(System.in);

        String north = "north";
        String word;

        do
        {
            System.out.print("Enter a word: ");

            word = s.next();
            word = word.toLowerCase();
        }
        while(!(word.compareTo(north) > 0 && word.length() > 6));

        return word;
    }

    /*
     * Loop Algorithm #7: Addition with Strings (Extension)
     * Write an algorithm to identify the individual digits in a String and apply an addition operations, returning 
     *  the result.
     * For example, if the integer "123 + 123" is entered by a user, return 246.
     */
    public static double identifyDigits(String operation)
    {
        /*
         * issue: does not work for last num
         */
        operation += " ";
        String numString = "0123456789";
        double sum = 0;
        int bottomIndex = 0;
        int topIndex = 0;

        for (int stringIndex = 0; stringIndex < operation.length(); stringIndex++){     //loops through every character
            String currentChar = operation.substring(stringIndex,stringIndex+1);        // current character
            if (numString.indexOf(currentChar) != -1){                                  //helps parse the string into an int
                topIndex++;
            }
            else{
                if (bottomIndex != topIndex){                                   // makes sure the substring is not length 0
                    int value = Integer.valueOf(operation.substring(bottomIndex, topIndex));
                    sum+=value;
                }
                bottomIndex = stringIndex+1;
                topIndex = bottomIndex;

            }
        }
        return sum;
    }
}