package gtp4o.task18;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import static gtp4o.task18.Task18_OPENAI_gpt_4o.binaryArrayToInt;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task18_TestCase {
            @Test
    void testBasicExample1() {
        // Test with basic example where the array represents binary 1
        assertEquals(1, binaryArrayToInt(Arrays.asList(new Integer[]{0, 0, 0, 1})));
    }

    @Test
    void testBasicExample2() {
        // Test with basic example where the array represents binary 2
        assertEquals(2, binaryArrayToInt(Arrays.asList(new Integer[]{0, 0, 1, 0})));
    }

    @Test
    void testBasicExample3() {
        // Test with basic example where the array represents binary 5
        assertEquals(5, binaryArrayToInt(Arrays.asList(new Integer[]{0, 1, 0, 1})));
    }

    @Test
    void testDuplicateValue() {
        // Test with an array where the binary value is 2
        assertEquals(2, binaryArrayToInt(Arrays.asList(new Integer[]{0, 0, 1, 0})));
    }

    @Test
    void testBinary6() {
        // Test with an array where the binary value is 6
        assertEquals(6,  binaryArrayToInt(Arrays.asList(new Integer[]{0, 1, 1, 0})));
    }

    @Test
    void testBinary15() {
        // Test with an array where the binary value is 15
        assertEquals(15, binaryArrayToInt(Arrays.asList(new Integer[]{1, 1, 1, 1})));
    }

    @Test
    void testBinary11() {
        // Test with an array where the binary value is 11
        assertEquals(11, binaryArrayToInt(Arrays.asList(new Integer[]{1, 0, 1, 1})));
    }

    @Test
    void testSingleBit1() {
        // Test with an array representing a single bit of 1
        assertEquals(1, binaryArrayToInt(Arrays.asList(new Integer[]{1})));
    }

    @Test
    void testSingleBit0() {
        // Test with an array representing a single bit of 0
        assertEquals(0, binaryArrayToInt(Arrays.asList(new Integer[]{0})));
    }

    @Test
    void testLongerArray() {
        // Test with a longer array representing binary 43
        assertEquals(43, binaryArrayToInt(Arrays.asList(new Integer[]{0, 1, 0, 1, 0, 1, 1})));
    }
}
