/** @author Shrey-Arc */
public interface PalindromeCheckerApp {
    boolean isPalindrome(String text);
}

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

// Strategy A: Using a Deque
class DequeStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String text) {
        Deque<Character> deque = new ArrayDeque<>();
        for (char c : text.toCharArray()) deque.addLast(c);
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) return false;
        }
        return true;
    }
}

// Strategy B: Using a Stack
class StackStrategy implements PalindromeStrategy {
    @Override
    public boolean isPalindrome(String text) {
        Stack<Character> stack = new Stack<>();
        for (char c : text.toCharArray()) stack.push(c);
        for (char c : text.toCharArray()) {
            if (c != stack.pop()) return false;
        }
        return true;
    }
}

public class PalindromeContext {
    private PalindromeStrategy strategy;

    // Inject strategy at runtime
    public void setStrategy(PalindromeStrategy strategy) {
        this.strategy = strategy;
    }

    public boolean executeCheck(String input) {
        // Pre-processing (Normalization) happens here once
        String clean = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        return strategy.isPalindrome(clean);
    }
}

public class Main {
    public static void main(String[] args) {
        PalindromeContext solver = new PalindromeContext();
        String testWord = "Racecar";

        // Switch to Deque logic
        solver.setStrategy(new DequeStrategy());
        System.out.println("Using Deque: " + solver.executeCheck(testWord));

        // Switch to Stack logic dynamically
        solver.setStrategy(new StackStrategy());
        System.out.println("Using Stack: " + solver.executeCheck(testWord));
    }
}
