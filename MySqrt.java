//Q17> Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.

//code:

public class MySqrt {
    public static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        int left = 1, right = x, ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                left = mid + 1;
            } else right = mid - 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int x = 8;
        System.out.println(mySqrt(x));
    }
}
