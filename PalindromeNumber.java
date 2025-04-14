//Q 1> Given an integer x, return true if x is a palindrome, and false otherwise

//code :
public class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int original = x;
        int reversed = 0;

        while (x != 0) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        return original == reversed;
    }

    public static void main(String[] args) {
        int num = 121;
        System.out.println(num + " is palindrome? " + isPalindrome(num));

        num = -121;
        System.out.println(num + " is palindrome? " + isPalindrome(num));

        num = 123;
        System.out.println(num + " is palindrome? " + isPalindrome(num));
    }
}




