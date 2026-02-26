import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String input) {
        String cleanInput = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        Deque<Character> charDeque = new ArrayDeque<>();

        for (char ch : cleanInput.toCharArray()) {
            charDeque.addLast(ch);
        }

        while (charDeque.size() > 1) {
            char first = charDeque.removeFirst();
            char last = charDeque.removeLast();

            if (first != last) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String test = "Racecar";
        System.out.println("Is '" + test + "' a palindrome? " + isPalindrome(test));
    }
}
