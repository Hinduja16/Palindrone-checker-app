import java.util.Scanner;

public class PalindromeChecker {

    // Method to check palindrome after normalization
    public static boolean isPalindrome(String input) {

        // Step 1: Normalize string
        // Convert to lowercase and remove all non-alphanumeric characters
        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Step 2: Two-pointer comparison
        int start = 0;
        int end = normalized.length() - 1;

        while (start < end) {
            if (normalized.charAt(start) != normalized.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println("The given string is a Palindrome (ignoring spaces & case).");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}