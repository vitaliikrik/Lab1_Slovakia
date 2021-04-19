package kry.edu.module5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  Task4
  @version  1.0.0 
  @since 4/19/2021 - 19.26
*/
public class Task4 {
    public static String prefix(String[] array) {
        int minLength = Arrays.stream(array)
                .mapToInt(String::length)
                .min()
                .getAsInt();
        List<String> prefixes = new ArrayList<>();
        for (int i = minLength; i > 0; i--) {
            int numberOfDigits = i;
            prefixes = Arrays.stream(array)
                    .map(string -> string.substring(0, numberOfDigits))
                    .distinct()
                    .collect(Collectors.toList());
            if (prefixes.size() <= 1) {
                break;
            }
        }
        return prefixes.size() == 1 ? prefixes.get(0) : "";
    }

    public static void main(String[] args) {
        String[] array = {"abc", "abcd", "abfce", "abcac"};
        System.out.println(prefix(array));  // ab
        String[] array2 = {"abc", "abcd", "abce", "abcac"};
        System.out.println(prefix(array2)); // abc

    }
}
