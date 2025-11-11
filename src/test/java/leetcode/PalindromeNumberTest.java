package leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeNumberTest {

    private static final PalindromeNumber solution = new PalindromeNumber();

    @Test
    void testExample1() {
        assertTrue(solution.isPalindrome(121));
    }

    @Test
    void testExample2() {
        assertFalse(solution.isPalindrome(-121));
    }

    @Test
    void testExample3() {
        assertFalse(solution.isPalindrome(10));
    }
}
