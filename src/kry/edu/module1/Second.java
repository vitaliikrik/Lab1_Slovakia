package kry.edu.module1;

import java.util.Optional;

public class Second {

    public static boolean isPalindrome1(String candidate) {
        candidate = candidate.replaceAll("[^A-za-z ]", "");
        candidate = candidate.toLowerCase();
        boolean result = true;
        for (int i = 0; i < (candidate.length() / 2); i++) {
            if (candidate.charAt(i) != candidate.charAt(candidate.length() - i - 1)) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean isPalindrome2(String candidate) {
        candidate = candidate.replaceAll("[^A-za-z ]", "");
        candidate = candidate.toLowerCase();
        StringBuilder sb = new StringBuilder(candidate);
        String reversedCandidate = sb.reverse().toString();
        return candidate.equals(reversedCandidate);
    }

    public static boolean isPalindrome3(String candidate) {
        candidate = candidate.replaceAll("[^A-za-z ]", "");
        candidate = candidate.toLowerCase();
        return false;
    }

    public static void main(String[] args) {
        String text = "abdcba";
        System.out.println("The first way: " + isPalindrome1(text));
        System.out.println("The second way: " + isPalindrome2(text));
        System.out.println("The third way: " + isPalindrome3(text));
    }
}
