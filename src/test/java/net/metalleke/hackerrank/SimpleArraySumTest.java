package net.metalleke.hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleArraySumTest {

    @Test
    public void exampleTest() {
        int[] ar = new int[3];
        ar[0] = 1;
        ar[1] = 2;
        ar[2] = 3;

        assertEquals(6, SimpleArraySum.simpleArraySum(ar));
    }

}