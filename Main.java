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

        System.out.println("Type the words below: ");
        System.out.println(words);
        wordsInput = input.nextLine();
        System.out.println(wordsInput);
    }
}