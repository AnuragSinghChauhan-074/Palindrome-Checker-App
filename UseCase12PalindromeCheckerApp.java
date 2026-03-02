import java.util.*;

// Strategy Interface
interface PalindromeStrategy {
    boolean check(String word);
}

// Stack-based strategy
class StackStrategy implements PalindromeStrategy {

    public boolean check(String word) {
        Stack<Character> stack = new Stack<>();

        for (char c : word.toCharArray()) {
            stack.push(c);
        }

        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        return word.equals(reversed);
    }
}

// Deque-based strategy
class DequeStrategy implements PalindromeStrategy {

    public boolean check(String word) {
        Deque<Character> deque = new ArrayDeque<>();

        for (char c : word.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (!deque.removeFirst().equals(deque.removeLast())) {
                return false;
            }
        }
        return true;
    }
}

// Context class
class PalindromeService {

    private PalindromeStrategy strategy;

    // Inject strategy at runtime
    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean checkPalindrome(String word) {
        return strategy.check(word);
    }
}

// Main application
public class UseCase12PalindromeCheckerApp {

    public static void main(String[] args) {

        String word = "madam";

        PalindromeService service = new PalindromeService();

        // Choose strategy dynamically
        PalindromeStrategy strategy = new StackStrategy();
        // Try new DequeStrategy() also

        service.setStrategy(strategy);

        if (service.checkPalindrome(word)) {
            System.out.println("The word \"" + word + "\" is a Palindrome.");
        } else {
            System.out.println("The word \"" + word + "\" is NOT a Palindrome.");
        }
    }
}