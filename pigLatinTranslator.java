/*****************************
*Created by
*Jason Beals 
******************************/

import java.util.Scanner;
public class pigLatinTranslator
{
    public static void main(String[] args)
    {
      Scanner in = new Scanner(System.in);
      
      final String vowels = "AEIOUaeiou"; //vowels do not change - setting as a final
        
      System.out.println("Welcome to the Pig Latin Translator!");
      System.out.println("");
      System.out.print("Please enter a word: "); //get word from user
      String userWord = in.nextLine();
      
      do //setting the do-while, so it runs at least once
      {
         String correctedWord = ""; //word translated into pig latin
            
         int pigLatin = 0;
            
         //while loop (if userWord starts with or without vowel)
         while (pigLatin < userWord.length() && !vowels.contains("" + userWord.charAt(pigLatin)))
         {
            correctedWord += userWord.charAt(pigLatin);
            pigLatin++;
         }
            if (pigLatin == 0)
            {
               pigLatin = 0;
               userWord = userWord.concat("w");//need "w" at end of word if starts with vowel
            }
            //printing the pig latin translated word 
            System.out.println("The translation is: " + userWord.substring(pigLatin) + correctedWord + "ay");
            System.out.println("");
            System.out.print("Enter another word to be translated (or press Q to quit): "); //get another input
            userWord = in.nextLine();
        }
        while (!userWord.equalsIgnoreCase("Q")); //ends if "Q" is entered
    }// end main
}//end class Assignment5PigLatin