package llama3.task27;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static llama3.task27.Task27_PERPLEXITY_llama_3_sonar_large_32k_chat.find;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Task27_TestCase {

    @Test
    void testCase1() {
        int[] input = {2, 4, 0, 100, 4, 11, 2602, 36};
        int expected = 11; // The only odd number
        assertEquals(expected, find(input));
    }

    @Test
    void testCase2() {
        int[] input = {160, 3, 1719, 19, 11, 13, -21};
        int expected = 160; // The only even number
        assertEquals(expected, find(input));
    }

    @Test
    void testCase3() {
        int[] input = {1, 3, 5, 7, 8}; // Only 8 is even
        int expected = 8;
        assertEquals(expected, find(input));
    }

    @Test
    void testCase4() {
        int[] input = {2, 4, 6, 8, 10, 13}; // Only 13 is odd
        int expected = 13;
        assertEquals(expected, find(input));
    }

    @Test
    void testCase5() {
        int[] input = {10, 12, 14, 16, 18, 21, 22}; // Only 21 is odd
        int expected = 21;
        assertEquals(expected, find(input));
    }

    @Test
    void testCase6() {
        int[] input = {1, 2, 3}; // Only 2 is even
        int expected = 2;
        assertEquals(expected, find(input));
    }

    @Test
    void testCase7() {
        int[] input = {3, 5, 7, 11, 2}; // Only 2 is even among odds
        int expected = 2;
        assertEquals(expected, find(input));
    }

    @Test
    void testCase8() {
        int[] input = {2, 2, 2, 2, 1}; // Only 1 is odd
        int expected = 1;
        assertEquals(expected, find(input));
    }

    @Test
    void testCase9() {
        int[] input = {11, 13, 15, 17, 19, 20}; // Only 20 is even
        int expected = 20;
        assertEquals(expected, find(input));
    }

    @Test
    void testCase10() {
        int[] input = {4, 8, 12, 16, 20, 21, 24}; // Only 21 is odd
        int expected = 21;
        assertEquals(expected, find(input));
    }
}