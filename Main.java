import java.util.Scanner;
import java.util.Random;

class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        
        // Generate random words
        String words = "";
        String[] wordList = {"person", "place", "thing", "and", "the", "any", "one", "if", "an"};
        String wordsInput = "";
        int index = 0;

        for(int i = 0; i < 5; i++)
        {
            index = rand.nextInt(wordList.length);
            words += wordList[index] + " ";
        }
        words.trim();

        // Print words and get user input
        System.out.println("Type the words below: ");
        System.out.println(words);
        wordsInput = input.nextLine();

        // Determine and print results
        int wordsLength = 0;
        int var1 = words.length();
        int var2 = wordsInput.length();
        if(var1 > var2)
        {
            System.out.println("y");
        }
        int correctChars = 0;
        for(int i = 0; i < wordsLength; i++)
        {
            if(words.charAt(i) == wordsInput.charAt(i))
            {
                correctChars++;
            }
        }
        
        //
        System.out.println(wordsInput);
        System.out.println(correctChars);
    }
}