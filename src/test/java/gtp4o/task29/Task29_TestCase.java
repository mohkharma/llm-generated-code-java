package gtp4o.task29;

import gtp4o.task29.Task29_OPENAI_gpt_4o;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Task29_TestCase {

    @Test
    void testCase1() {
        int[] numbers = {1, 2, 3};
        int target = 4;
        int[] expected = {0, 2}; // 1 + 3 = 4
        assertArrayEquals(expected, Task29_OPENAI_gpt_4o.twoSum(numbers, target));
    }

    @Test
    void testCase2() {
        int[] numbers = {3, 2, 4};
        int target = 6;
        int[] expected = {1, 2}; // 2 + 4 = 6
        assertArrayEquals(expected, Task29_OPENAI_gpt_4o.twoSum(numbers, target));
    }

    @Test
    void testCase3() {
        int[] numbers = {1, -2, 3, 4};
        int target = 7;
        int[] expected = {2, 3}; // 3 + 4 = 7
        assertArrayEquals(expected, Task29_OPENAI_gpt_4o.twoSum(numbers, target));
    }

    @Test
    void testCase4() {
        int[] numbers = {0, 1, 2};
        int target = 3;
        int[] expected = {1, 2}; // 1 + 2 = 3
        assertArrayEquals(expected, Task29_OPENAI_gpt_4o.twoSum(numbers, target));
    }

    @Test
    void testCase5() {
        int[] numbers = {2, 2, 3};
        int target = 4;
        int[] expected = {0, 1}; // 2 + 2 = 4
        assertArrayEquals(expected, Task29_OPENAI_gpt_4o.twoSum(numbers, target));
    }

    @Test
    void testCase6() {
        int[] numbers = {5, 7, 3, 9};
        int target = 12;
        int[] expected = {0, 1}; // 7 + 5 = 12
        assertArrayEquals(expected, Task29_OPENAI_gpt_4o.twoSum(numbers, target));
    }

    @Test
    void testCase7() {
        int[] numbers = {-5, -2, -3, 1};
        int target = -7;
        int[] expected = {0, 1}; // -5 + (-2) = -7
        assertArrayEquals(expected, Task29_OPENAI_gpt_4o.twoSum(numbers, target));
    }

    @Test
    void testCase8() {
        int[] numbers = {10, 20, 30, 40};
        int target = 50;
        int[] expected = {0, 3}; // 20 + 30 = 50
        assertArrayEquals(expected, Task29_OPENAI_gpt_4o.twoSum(numbers, target));
    }

    @Test
    void testCase9() {
        int[] numbers = {1, 2, 5, 9};
        int target = 14;
        int[] expected = {2, 3}; // 5 + 9 = 14
        assertArrayEquals(expected, Task29_OPENAI_gpt_4o.twoSum(numbers, target));
    }

    @Test
    void testCase10() {
        int[] numbers = {7, 14, 21, 28};
        int target = 35;
        int[] expected = {0, 3};
        assertArrayEquals(expected, Task29_OPENAI_gpt_4o.twoSum(numbers, target));
    }
}