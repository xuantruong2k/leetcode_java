package leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MaximizeExpressOfThreeTest {

    private final MaximizeExpressionOfThree solution = new MaximizeExpressionOfThree();

    @Test
    void testExample1() {
        int expected = 8;
        int actual = solution.maximizeExpressionOfThree(new int[]{1,4,2,5});
        assert expected == actual;
    }

    @Test
    void testExample2() {
        int expected = 11;
        int actual = solution.maximizeExpressionOfThree(new int[]{-2,0,5,-2,4});
        assert expected == actual;
    }

    @Test
    void testExample3() {
        int expected = 3;
        int actual = solution.maximizeExpressionOfThree(new int[]{-5,-1,-1});
        assert expected == actual;
    }

    @Test
    void testExample4() {
        int expected = -2;
        int actual = solution.maximizeExpressionOfThree(new int[]{-4,-8,-10});
        assert expected == actual;
    }

    @Test
    void testExample5() {
        int expected = 6;
        int actual = solution.maximizeExpressionOfThree(new int[]{0,-3,-6,-9});
        assert expected == actual;
    }
}
