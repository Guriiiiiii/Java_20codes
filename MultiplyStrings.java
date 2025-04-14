//Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

public class MultiplyStrings {
    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        int[] res = new int[num1.length() + num2.length()];
        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = mul + res[i + j + 1];
                res[i + j] += sum / 10;
                res[i + j + 1] = sum % 10;
            }
        }
        StringBuilder result = new StringBuilder();
        for (int num : res) {
            if (result.length() != 0 || num != 0) result.append(num);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String num1 = "123", num2 = "456";
        System.out.println(multiply(num1, num2));
    }
}
