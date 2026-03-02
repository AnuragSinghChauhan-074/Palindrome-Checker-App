// Service class encapsulating palindrome logic
class PalindromeChecker {

    // Method to check palindrome
    public boolean checkPalindrome(String word) {

        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }
}

// Main application class
public class UseCase11PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        // Create object of service class
        PalindromeChecker checker = new PalindromeChecker();

        // Use service method
        if (checker.checkPalindrome(word)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }
    }
}