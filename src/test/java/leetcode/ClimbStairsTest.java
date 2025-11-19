package leetcode;

import org.junit.jupiter.api.Test;

public class ClimbStairsTest {
    private final ClimbStairs solution = new ClimbStairs();

    @Test
    void testExample1() {
        int expected = 2;
        int actual = solution.climbStairs(2);
        assert expected == actual;
    }

    @Test
    void testExample2() {
        int expected = 3;
        int actual = solution.climbStairs(3);
        assert expected == actual;
    }

    @Test
    void testExample3() {
        int expected = 13;
        int actual = solution.climbStairs(6);
        assert expected == actual;
    }

    @Test
    void testExample4() {
        int expected = 10946;
        int actual = solution.climbStairs(20);
        assert expected == actual;
    }

    @Test
    void testExample5() {
        int expected = 1836311903;
        int actual = solution.climbStairs(45);
        assert expected == actual;
    }

}
