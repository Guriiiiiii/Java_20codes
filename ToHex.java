
//Q12> Given a 32-bit integer num, return a string representing its hexadecimal representation. For negative integers, two’s complement method is used.
//All the letters in the answer string should be lowercase characters, and there should not be any leading zeros in the answer except for the zero itself.


//code :

public class ToHex {
    public static String toHex(int num) {
        if (num == 0) return "0";
        char[] hexChars = "0123456789abcdef".toCharArray();
        StringBuilder result = new StringBuilder();
        while (num != 0) {
            result.append(hexChars[num & 15]);
            num >>>= 4;
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        int num = 26;
        System.out.println(toHex(num));
    }
}

