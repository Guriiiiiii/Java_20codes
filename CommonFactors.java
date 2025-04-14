//Q19> Given two positive integers a and b, return the number of common factors of a and b.

//An integer x is a common factor of a and b if x divides both a and b.

//code:
 
public class CommonFactors {
    public static int commonFactors(int a, int b) {
        int count = 0;
        int min = Math.min(a, b);
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int a = 12, b = 6;
        System.out.println(commonFactors(a, b));
    }
}
