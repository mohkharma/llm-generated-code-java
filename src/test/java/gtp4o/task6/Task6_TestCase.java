package gtp4o.task6;

import org.junit.jupiter.api.Test;

import static gtp4o.task6.Task6_OPENAI_gpt_4o.findUniq;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class Task6_TestCase {

    @Test
    void testCase1() {
        assertEquals(2.0, findUniq(new double[]{ 1, 1, 1, 2, 1, 1 }));
    }

    @Test
    void testCase2() {
        assertEquals(0.55, findUniq(new double[]{ 0, 0, 0.55, 0, 0 }));
    }

    @Test
    void testCase3() {
        assertEquals(3.0, findUniq(new double[]{ 3, 2, 2, 2, 2 }));
    }

    @Test
    void testCase4() {
        assertEquals(5.5, findUniq(new double[]{ 1, 1, 5.5, 1, 1 }));
    }

    @Test
    void testCase5() {
        assertEquals(-3.5, findUniq(new double[]{ -1, -1, -1, -3.5, -1 }));
    }

    @Test
    void testCase6() {
        assertEquals(100.1, findUniq(new double[]{ 100.1,  100, 100, 100, 100 })); //change order
    }

    @Test
    void testCase7() {
        assertEquals(-2.0, findUniq(new double[]{ 0, 0, -2, 0, 0 }));
    }

    @Test
    void testCase8() {
        assertEquals(0.123, findUniq(new double[]{ 0.1, 0.1, 0.123, 0.1, 0.1 }));
    }

    @Test
    void testCase9() {
        assertThrows(Exception.class, () -> {
            findUniq(new double[]{ 10, 10, 7, 9.999, 10 });
        });
    }

    @Test
    void testCase10() {
        assertEquals(-7.7, findUniq(new double[]{ -7, -7, -7.7, -7, -7 }));
    }
}