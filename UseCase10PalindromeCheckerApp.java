public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string with spaces and mixed case
        String input = "A man a plan a canal Panama";

        // Normalize string: remove spaces & convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        // Check palindrome
        String reversed = new StringBuilder(normalized).reverse().toString();

        if (normalized.equals(reversed)) {
            System.out.println("The sentence \"" + input + "\" is a Palindrome.");
        } else {
            System.out.println("The sentence \"" + input + "\" is NOT a Palindrome.");
        }
    }
}