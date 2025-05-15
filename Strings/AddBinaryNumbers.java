/*
Definition : Given two binary strings s1 and s2 consisting of only 0s and 1s. Find the resultant string after adding the two Binary Strings.
Note: The input strings may contain leading zeros but the output string should not have any leading zeros.

Input: s1 = "1101", s2 = "111"
Output: 10100
Explanation:
 1101
+ 111
10100

*/

class AddBinaryNumbers {
    public static void main(String[] args) {
        String s1 = "1101", s2 = "111";
        String ans = addBinary(s1, s2);
        System.out.println(ans); // Expected output: "10100"
    }

    public static String addBinary(String s1, String s2) {
        int l1 = s1.length();
        int l2 = s2.length();
        int i = l1 - 1;
        int j = l2 - 1;
        int carry = 0;

        StringBuilder ans = new StringBuilder();

        while (i >= 0 || j >= 0 || carry != 0) {
            int bit1 = (i >= 0) ? s1.charAt(i) - '0' : 0;
            int bit2 = (j >= 0) ? s2.charAt(j) - '0' : 0;

            int sum = bit1 + bit2 + carry;
            ans.append(sum % 2);     // Add the current bit to result
            carry = sum / 2;         // Update carry

            i--;
            j--;
        }

        // Since we've built the string in reverse, reverse it at the end
        return ans.reverse().toString();
    }
}
