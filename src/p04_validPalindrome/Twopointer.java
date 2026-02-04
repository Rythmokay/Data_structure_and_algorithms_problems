package p04_validPalindrome;

public class Twopointer {
    public boolean isPalindrome(String s) {
        // Preprocess the string by removing non-alphanumeric characters and converting to lowercase
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int front = 0;
        int back = s.length() - 1;

        // Compare characters from both ends moving towards the center
        while (front < back) {
            if (s.charAt(front) != s.charAt(back)) {
                return false; // Not a palindrome
            }
            front++; // Move front pointer to the right
            back--;  // Move back pointer to the left
        }

        return true; // It is a palindrome
    }
}
