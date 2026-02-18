public class PalindromeChecker {

    public static void main(String[] args) {

        // Program starts
        System.out.println("=== Palindrome Checker  ===");

        // Hardcoded string
        String word = "madam";

        // Reverse the string
        String reversed = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversed = reversed + word.charAt(i);
        }

        // Check if the string is a palindrome
        if (word.equals(reversed)) {
            System.out.println("Result: " + word + " is a Palindrome.");
        } else {
            System.out.println("Result: " + word + " is NOT a Palindrome.");
        }

        // Program exits
        System.out.println("Program Ended.");
    }
}


