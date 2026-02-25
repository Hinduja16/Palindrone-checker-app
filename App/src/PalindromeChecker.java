import java.util.Scanner;

// Service Class (Encapsulation)
class PalindromeService {

    public boolean checkPalindrome(String input) {

        if (input == null)
            return false;

        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");

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
}

// Main Application Class
public class PalindromeChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Create service object
        PalindromeService checker = new PalindromeService();

        boolean result = checker.checkPalindrome(input);

        if (result) {
            System.out.println("The given string is a Palindrome.");
        } else {
            System.out.println("The given string is NOT a Palindrome.");
        }

        scanner.close();
    }
}