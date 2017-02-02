package net.metalleke.codewars.kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class OppositeNumberTest {

    @Test
    public void tests() {
        assertEquals(-1, OppositeNumber.opposite(1));
    }
}