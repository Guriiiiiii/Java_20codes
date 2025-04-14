//Q15> Given an integer num, return a string of its base 7 representation.


//code:

public class Base7 {
    public static String convertToBase7(int num) {
        if (num == 0) return "0";
        boolean negative = num < 0;
        num = Math.abs(num);
        StringBuilder result = new StringBuilder();
        while (num > 0) {
            result.append(num % 7);
            num /= 7;
        }
        if (negative) result.append("-");
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        int num = 100;
        System.out.println(convertToBase7(num));
    }
}