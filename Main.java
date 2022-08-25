import java.util.Scanner;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        // Generate random words
        String words = "";
        // String[] wordList = {"person", "place", "thing", "and", "the", "any", "one", "if", "an"};
        int index = 0;

        for(int i = 0; i < 5; i++)
        {
            // index = rand.nextInt(wordList.length);
            // words += wordList[index] + " ";
            index = rand.nextInt(Bank.wordBank.length);
            words += Bank.wordBank[index] + " ";
        }
        words.trim();

        // Print words and get user input
        System.out.println("Type the words below: ");
        System.out.println(words);
        String wordsInput = input.nextLine();

        /*
        Determine and print results
        */
        
        int wordsLength = 0;
        int var1 = words.length();
        int var2 = wordsInput.length();
        int diff;

        // Select the smaller num to avoid out of range errors
        if(var1 > var2)
        {
            wordsLength = var2;
            diff = var1 - var2;
        }
        else
        {
            wordsLength = var1;
            diff = var2 - var1;
        }

        // Calculate accuracy and time to the tenths place
        int correctChars = 0;

        for(int i = 0; i < wordsLength; i++)
        {
            if(words.charAt(i) == wordsInput.charAt(i))
            {
                correctChars++;
            }
        }

        double accuracy = ((correctChars * 1000) / (wordsLength + diff));
        
        // Print results
        System.out.println("Accuracy: " + accuracy/10);
    }
}