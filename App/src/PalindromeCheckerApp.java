public class PalindromeCheckerApp {
    public static void main(String[] args) {
        // 1. Program starts & Hardcoded string is defined
        String input = "radar";

        // 2. Hardcoded string is checked
        String cleanInput = input.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        String reversed = new StringBuilder(cleanInput).reverse().toString();

        boolean isPalindrome = cleanInput.equals(reversed);

        // 3. Result is printed
        System.out.println("String: " + input);
        System.out.println("Is Palindrome? " + isPalindrome);

        // 4. Program exits
    }
}
