//Q9> Given an integer n, return true if it is a power of four. Otherwise, return false.

//code : 

public class PowerOfFour {
    public static boolean isPowerOfFour(int n) {
        if (n <= 0) return false;
        while (n % 4 == 0) n /= 4;
        return n == 1;
    }

    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfFour(n));
    }
}
