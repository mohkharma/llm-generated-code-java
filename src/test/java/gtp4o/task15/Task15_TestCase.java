package gtp4o.task15;

import org.junit.jupiter.api.Test;

import static gtp4o.task15.TowerBuilder.buildTower;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class Task15_TestCase {

    @Test
    void testOneFloor() {
        String[] expected = {"*"};
        assertArrayEquals(expected, buildTower(1));
    }

    @Test
    void testTwoFloors() {
        String[] expected = {
                " * ",
                "***"
        };
        assertArrayEquals(expected, buildTower(2));
    }

    @Test
    void testThreeFloors() {
        String[] expected = {
                "  *  ",
                " *** ",
                "*****"
        };
        assertArrayEquals(expected, buildTower(3));
    }

    @Test
    void testFourFloors() {
        String[] expected = {
                "   *   ",
                "  ***  ",
                " ***** ",
                "*******"
        };
        assertArrayEquals(expected, buildTower(4));
    }

    @Test
    void testFiveFloors() {
        String[] expected = {
                "    *    ",
                "   ***   ",
                "  *****  ",
                " ******* ",
                "*********"
        };
        assertArrayEquals(expected, buildTower(5));
    }

    @Test
    void testSixFloors() {
        String[] expected = {
                "     *     ",
                "    ***    ",
                "   *****   ",
                "  *******  ",
                " ********* ",
                "***********"
        };
        assertArrayEquals(expected, buildTower(6));
    }

    @Test
    void testSevenFloors() {
        String[] expected = {
                "      *      ",
                "     ***     ",
                "    *****    ",
                "   *******   ",
                "  *********  ",
                " *********** ",
                "*************"
        };
        assertArrayEquals(expected, buildTower(7));
    }

    @Test
    void testEightFloors() {
        String[] expected = {
                "       *       ",
                "      ***      ",
                "     *****     ",
                "    *******    ",
                "   *********   ",
                "  ***********  ",
                " ************* ",
                "***************"
        };
        assertArrayEquals(expected, buildTower(8));
    }

    @Test
    void testNineFloors() {
        String[] expected = {
                "        *        ",
                "       ***       ",
                "      *****      ",
                "     *******     ",
                "    *********    ",
                "   ***********   ",
                "  *************  ",
                " *************** ",
                "*****************"
        };
        assertArrayEquals(expected, buildTower(9));
    }

    @Test
    void testTenFloors() {
        String[] expected = {
                "         *         ",
                "        ***        ",
                "       *****       ",
                "      *******      ",
                "     *********     ",
                "    ***********    ",
                "   *************   ",
                "  ***************  ",
                " ***************** ",
                "*******************"
        };
        assertArrayEquals(expected, buildTower(10));
    }
}
