
//Q 3> Given two binary strings a and b, return their sum as a binary string.

//code : 
public class AddBinary {
    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int bitA = (i >= 0) ? a.charAt(i) - '0' : 0;
            int bitB = (j >= 0) ? b.charAt(j) - '0' : 0;
            int sum = bitA + bitB + carry;
            result.append(sum % 2);
            carry = sum / 2;
            i--;
            j--;
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        String a = "1010";
        String b = "1011";
        String sum = addBinary(a, b);
        System.out.println("Sum: " + sum);
    }
}
