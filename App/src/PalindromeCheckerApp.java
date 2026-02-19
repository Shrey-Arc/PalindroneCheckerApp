public class PalindromeCheckerApp {
    public static void main(String[] args) {
        String original = "Madam";

        String reversed = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        boolean isPalindrome = original.equalsIgnoreCase(reversed);

        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);

        if (isPalindrome) {
            System.out.println("Result: The string IS a palindrome.");
        } else {
            System.out.println("Result: The string IS NOT a palindrome.");
        }
    }
}
