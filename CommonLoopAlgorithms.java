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
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String word;

        System.out.println("Enter words (type 'quit' to end):");

        while (true) {
            word = scanner.next();  
            if (word.equals("quit")) {
                break;  
            }
            if (word.length() > 4) {
                count++;  
            }
        }

        scanner.close();  
        System.out.println("Total words of length greater than four: " + count);
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
        int amount = 0;
        Scanner s = new Scanner(System.in);
        String word = "";

        do
        {
            System.out.print("enter a word (type 'quit' for sum): ");
            word = s.next();

            if (word.substring(0,3).equals("con"))
            {
                amount++;
            }
        }
        while (!word.equals("quit"));

        return amount;
    }

    /*
     * Loop Algorithm #3: Count Matches for Suffix
     * reads a series of words (ends with "quit")
     * counts the number of words that end with the substring "est"
     * @return the number of words  that end with the substring "est"
     */
    public static int countMatchesForSuffix()
    {
        String word = "";
        int count = 0;
        Scanner s = new Scanner(System.in);

        do
        {
            System.out.print("Enter a word (type 'quit' to quit): ");
            word = s.next();
            if(word.substring(word.length() - 3).compareTo("est") == 0)
            {
                count++;
            }
        }
        while(word.compareTo("quit") != 0);

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
        Scanner userInput = new Scanner(System.in); //create scaanner object
        System.out.print("Enter one word"); //prompt user to enter word
        String word = userInput.next(); //store next token the user enters
        String reversedWord = ""; //assign the reversed word as an empty string

        for(int indexOfWord = word.length() -1; indexOfWord >= 0; indexOfWord--) //the index of the characters in the word will start at the last index and decrease, up until index 0
        {
            char characterBeingMoved = word.charAt(indexOfWord); //character at the specific index is stored in characterBeingMoved
            reversedWord += characterBeingMoved; //basically concatenating the character at the last index of the word to an empty string,
            //adding on each subsequent character at a decreasing index onto the last character at the last index, so the word is reversed
        }

        return reversedWord; //method returns a String
    }

    /*
     * Loop Algorithm #5: Compare Adjacent Words
     * reads a series of words until an adjacent duplicate word is entered
     * @return the number of unique words entered before the duplicate
     */
    public static int compareAdjacent()
    {
        Scanner s = new Scanner(System.in);
        String s1, s2;
        int count = 0;

        System.out.println("Enter a word: ");
        s1 = s.next();
        count++;

        System.out.println("Enter a word: ");
        s2 = s.next();
        count++;

        if (s1.equals(s2) == false)
        {
            do
            {
                System.out.println("Enter a word: ");
                s1 = s.next();
                count++;

                if (s1.equals(s2) == true)
                {
                    break;
                }

                System.out.println("Enter a word: ");
                s2 = s.next();
                count++;

                if (s1.equals(s2) == true)
                {
                    break;
                }
            }
            while(s1.equals(s2) != true);
        }
        count = count - 2;
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
        boolean tf = true;
        Scanner s = new Scanner(System.in);
        do
        {
            System.out.print("enter a word that comes after north alphabetically: ");
            String word = s.next();
            int a = word.compareTo("north");
            if (a <= 0 )
            {
                System.out.println("word is less than or equal to north");
            }
            else if (a >0 && word.length() > 6)
            {
                System.out.println("CORRECT, " + word + " is greater than north alphabetically and more than 6.");
                tf = false;
                return word;
            }
            else
            {
                System.out.println("ERROR word is less than 6 characters.");
            }
        }
        while(tf == true);
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