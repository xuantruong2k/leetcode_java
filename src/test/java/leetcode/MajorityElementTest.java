package leetcode;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MajorityElementTest {
    private final MajorityElement solution = new MajorityElement();

    @Test
    void testExample1() {
        assertEquals(3, solution.majorityElement(new int[]{3, 2, 3}));
    }

    @Test
    void testExample2() {
        assertEquals(2, solution.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }

    @Test
    void testSingleElement() {
        assertEquals(1, solution.majorityElement(new int[]{1}));
    }

    @Test
    void testAllSame() {
        assertEquals(5, solution.majorityElement(new int[]{5, 5, 5, 5}));
    }
}