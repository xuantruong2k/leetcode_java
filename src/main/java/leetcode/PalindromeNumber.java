package leetcode;

/**
 * LeetCode #9 - Palindrome Number
 * https://leetcode.com/problems/palindrome-number/description/
 *
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        return isPalindrome2(x);

//        if (x < 0)
//            return false;
//
//        String str = String.valueOf(x);
////        return isPalindromeRecursive(str, 0, str.length()-1);
//
//        var strLen = str.length();
//        for (int i = 0, j = strLen - 1; i < strLen / 2; i++) {
//            if (str.charAt(i) != str.charAt(j - i))
//                return false;
//        }
//
//        return true;
    }

    private Boolean isPalindromeRecursive(String str, int left, int right) {
        if (left >= right)
            return true;
        if (str.charAt(left) != str.charAt(right))
            return false;
        return isPalindromeRecursive(str, left + 1, right - 1);
    }

    private Boolean isPalindrome2(int x) {
        if (x < 0)
            return false;

        int ori = x;
        int rev = 0;
        while (ori > 0) {
            int digit = ori % 10;
            ori = ori / 10;

            rev = rev * 10 + digit;
        }

        return x == rev;
    }
}
