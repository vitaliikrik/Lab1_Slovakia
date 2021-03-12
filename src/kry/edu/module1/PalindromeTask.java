package kry.edu.module1;

/*
  @author   Vitalii Krykun
  @project   LabsSlovakia
  @class  PalindromeTask
  @version  1.0.0
  @since 3/8/2021 - 19.40
*/
public class PalindromeTask {

    public static final String ARGUMENT_IS_MULL_MESSAGE =
            "Palindrome candidate must not be null";

    public static boolean isPalindrome1(String candidate) {
        checkIfNullArgument(candidate);
        candidate = candidate.replaceAll("[^A-za-z ]", "")
                .toLowerCase();
        for (int i = 0; i < candidate.length() / 2; i++) {
            if (candidate.charAt(i) != candidate.charAt(candidate.length()
                    - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome2(String candidate) {
        checkIfNullArgument(candidate);
        candidate = candidate.replaceAll("[^A-za-z ]", "")
                .toLowerCase();
        String reversedString = "";
        for (int i = candidate.length() - 1; i >= 0; i--) {
            reversedString += candidate.charAt(i);
        }
        return candidate.equals(reversedString);
    }

    public static boolean isPalindrome3(String candidate) {
        checkIfNullArgument(candidate);
        candidate = candidate.replaceAll("[^A-za-z ]", "")
                .toLowerCase();
        return candidate.equals(new StringBuilder(candidate).reverse()
                .toString());
    }

    private static void checkIfNullArgument(String candidate) {
        if (candidate == null) {
            throw new IllegalArgumentException(ARGUMENT_IS_MULL_MESSAGE);
        }
    }

    private static void checkPalindromeWithDifferentMethods(String candidate) {
        System.out.println("Is '" + candidate + "' a palindrome?");
        System.out.println("The first way: " + isPalindrome1(candidate));
        System.out.println("The second way: " + isPalindrome2(candidate));
        System.out.println("The third way: " + isPalindrome3(candidate));
    }

    public static void main(String[] args) {
        String palindromeText = "abdba";
        String nonPalindromeText = "abcdba";
        checkPalindromeWithDifferentMethods(palindromeText);
        checkPalindromeWithDifferentMethods(nonPalindromeText);
    }
}
