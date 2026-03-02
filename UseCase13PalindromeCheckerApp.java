import java.util.*;

public class UseCase13PalindromeCheckerApp {

    // Method 1: Reverse using StringBuilder
    public static boolean methodReverse(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }

    // Method 2: Stack method
    public static boolean methodStack(String word) {
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

    // Method 3: Deque method
    public static boolean methodDeque(String word) {
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

    public static void main(String[] args) {

        String word = "madam";

        // Reverse method timing
        long start1 = System.nanoTime();
        methodReverse(word);
        long end1 = System.nanoTime();

        // Stack method timing
        long start2 = System.nanoTime();
        methodStack(word);
        long end2 = System.nanoTime();

        // Deque method timing
        long start3 = System.nanoTime();
        methodDeque(word);
        long end3 = System.nanoTime();

        System.out.println("Performance Comparison (nanoseconds):");
        System.out.println("Reverse Method: " + (end1 - start1));
        System.out.println("Stack Method:   " + (end2 - start2));
        System.out.println("Deque Method:   " + (end3 - start3));
    }
}