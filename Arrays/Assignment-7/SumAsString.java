package Assignment_7;
//Question 3: Given two non-negative integers, num1 and num2 represented as string, return *the sum of*
//num1 *and* num2 *as a string*. You must solve the problem without using any built-in library for handling
//large integers (such as BigInteger). You must also not convert the inputs to integers directly.
//Input: num1 = "11", num2 = "123"
//Output: "134"

class SumAsString {
    public static void main(String[] args) {
        String num1="11";
        String num2="123";
        System.out.println(addStrings(num1,num2));
    }
    public static String addStrings(String num1, String num2) {
        String big = num1.length() >= num2.length() ? num1 : num2;
        String small = num1.length() < num2.length() ? num1 : num2;
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        for (int i = 0; i < big.length(); i++) {
            int b = big.charAt(big.length() - i - 1) - '0';
            int s = i < small.length() ? (small.charAt(small.length() - i - 1) - '0') : 0;
            sum += b + s;
            sb.append(sum % 10);
            sum /= 10;
        }
        if (sum > 0) sb.append(sum);
        return sb.reverse().toString();
    }
}
