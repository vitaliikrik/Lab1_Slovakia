package kry.edu.module1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  LaboratoryWork1
  @version  1.0.0 
  @since 3/15/2021 - 18.02
*/
public class LaboratoryWork1 {
    public static void main(String[] args) throws IOException {
        String text = new String(Files.readAllBytes(Paths.get("Harry.txt")));
        //Cleaning the text from a punctuation signs
        text = text.replaceAll("[^A-Za-z ']", "");
        //Splitting the novel into an array of words
        String[] words = text.split(" +");
        //Creation of another array containing distinct words
        String distinctWordsString = "";
        for (String word : words) {
            if (!distinctWordsString.contains(word)) {
                distinctWordsString += word + " ";
            }
        }
        String[] distinctWords = distinctWordsString.split(" +");

        //1. Find the longest word in the above text
        int maxLength = 0;
        for (String word : distinctWords) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }
        System.out.print("The longest words are: ");
        for (String word : distinctWords) {
            if (word.length() == maxLength) {
                System.out.print(word + " ");//The longest words are: interestinglooking
            }
        }
        System.out.println();

        //2. Count the LINES where the word "Harry" is met.
        text = new String(Files.readAllBytes(Paths.get("Harry.txt")));
        String[] lines = text.split("\n");
        int countWithHarry = 0;
        for (String line : lines) {
            String temporaryLine = line.replaceAll("[^A-Za-z ']", "");
            String[] temporaryWords = temporaryLine.split(" +");
            for (String temporaryWord : temporaryWords) {
                if (temporaryWord.equals("Harry")) {
                    countWithHarry++;
                    break;
                }
            }
        }
        System.out.println("Number of lines where the word \"Harry\" is met: "
                + countWithHarry);//Number of lines where the word "Harry" is met: 1213

        //How many distinct words begin from the letter "C"
        int countOfWordsFromC = 0;
        for (String word : distinctWords) {
            if (word.charAt(0) == 'C') {
                countOfWordsFromC++;
            }
        }
        System.out.println("Count of words that begin with C is "
                + countOfWordsFromC);//Count of words that begin with C is 80

        //Create an array of hashes
        int[] arrayOfHashes = new int[distinctWords.length];
        for (int i = 0; i < distinctWords.length; i++) {
            arrayOfHashes[i] = distinctWords[i].hashCode();
        }

        //Count the intersections of hashes.
        Arrays.sort(arrayOfHashes);
        int countOfIntersections = 0;
        for (int i = 0; i < arrayOfHashes.length - 1; i++) {
            if (arrayOfHashes[i] == arrayOfHashes[i + 1]) {
                countOfIntersections++;
            }
        }
        System.out.println("Count of intersections: " + countOfIntersections);
        //Count of intersections: 0
    }
}
