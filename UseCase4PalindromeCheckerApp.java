public class UseCase4PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String word = "madam";

        // Convert string to character array
        char[] chars = word.toCharArray();

        // Two-pointer technique
        int left = 0;
        int right = chars.length - 1;

        boolean isPalindrome = true;

        while (left < right) {
            if (chars[left] != chars[right]) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }
    }
}