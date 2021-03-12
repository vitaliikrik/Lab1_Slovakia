package kry.edu.module1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  HarryTask
  @version  1.0.0 
  @since 3/10/2021 - 20.00
*/
public class HarryTask {

    public static void main(String[] args) throws IOException {
        String text = new String(Files.readAllBytes(Paths.get("Harry.txt")));

        //Cleaning the text from a punctuation signs
        text = text.replaceAll("[^A-Za-z ']", "");

        //Splitting the novel into an array of words
        String[] words = text.split(" +");
        System.out.println("Number of split words: " + words.length);

        //Creation of another array containing distinct words
        String distinctWordsString = "";
        for (String word : words) {
            if (!distinctWordsString.contains(word)) {
                distinctWordsString += word + " ";
            }
        }
        String[] distinctWords = distinctWordsString.split(" +");
        System.out.println("Number of distinct words: " + distinctWords.length);

        //Ordering the words alphabetically
        Arrays.sort(distinctWords);
        System.out.println("Array in alphabetical order: "
                + Arrays.toString(distinctWords));
    }

}
