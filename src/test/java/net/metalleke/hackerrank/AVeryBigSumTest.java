package net.metalleke.hackerrank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AVeryBigSumTest {

    @Test
    public void exampleTest() {
        long[] ar = new long[5];
        ar[0] = 1000000001l;
        ar[1] = 1000000002l;
        ar[2] = 1000000003l;
        ar[3] = 1000000004l;
        ar[4] = 1000000005l;

        assertEquals(5000000015l, AVeryBigSum.aVeryBigSum(ar));
    }
}