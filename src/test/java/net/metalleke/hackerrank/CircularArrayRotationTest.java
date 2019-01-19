package net.metalleke.hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CircularArrayRotationTest {

    @Test
    public void no_rotation() {
        final int[] startArray = new int[3];
        startArray[0] = 3;
        startArray[1] = 4;
        startArray[2] = 5;
        final int rotations = 0;
        final int[] queries = new int[2];
        queries[0] = 1;
        queries[1] = 2;

        int[] result = CircularArrayRotation.circularArrayRotation(startArray, rotations, queries);

        assertEquals(4, result[0]);
        assertEquals(5, result[1]);
    }

    @Test
    public void one_rotation() {
        final int[] startArray = new int[3];
        startArray[0] = 3;
        startArray[1] = 4;
        startArray[2] = 5;
        final int rotations = 1;
        final int[] queries = new int[2];
        queries[0] = 1;
        queries[1] = 2;

        int[] result = CircularArrayRotation.circularArrayRotation(startArray, rotations, queries);

        assertEquals(3, result[0]);
        assertEquals(4, result[1]);
    }

    @Test
    public void two_rotation() {
        final int[] startArray = new int[3];
        startArray[0] = 3;
        startArray[1] = 4;
        startArray[2] = 5;
        final int rotations = 2;
        final int[] queries = new int[2];
        queries[0] = 1;
        queries[1] = 2;

        int[] result = CircularArrayRotation.circularArrayRotation(startArray, rotations, queries);

        assertEquals(5, result[0]);
        assertEquals(3, result[1]);
    }

    @Test
    public void three_rotation() {
        final int[] startArray = new int[3];
        startArray[0] = 3;
        startArray[1] = 4;
        startArray[2] = 5;
        final int rotations = 3;
        final int[] queries = new int[2];
        queries[0] = 1;
        queries[1] = 2;

        int[] result = CircularArrayRotation.circularArrayRotation(startArray, rotations, queries);

        assertEquals(4, result[0]);
        assertEquals(5, result[1]);
    }

}