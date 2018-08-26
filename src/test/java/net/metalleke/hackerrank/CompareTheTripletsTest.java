package net.metalleke.hackerrank;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class CompareTheTripletsTest {

    @Test
    public void exampleTest() {
        int[] ar = new int[3];
        ar[0] = 1;
        ar[1] = 2;
        ar[2] = 3;

        assertEquals(Arrays.asList(1, 1), CompareTheTriplets.compareTriplets(Arrays.asList(5, 6, 7), Arrays.asList(3, 6, 10)));
    }
}