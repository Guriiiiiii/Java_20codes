//Q18> Given a positive integer num, return the number of positive integers less than or equal to num whose digit sums are even.

//The digit sum of a positive integer is the sum of all its digits.

//code:

public class CountEven {
    public static int countEven(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            int sum = 0, n = i;
            while (n != 0) {
                sum += n % 10;
                n /= 10;
            }
            if (sum % 2 == 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int num = 30;
        System.out.println(countEven(num));
    }
}

