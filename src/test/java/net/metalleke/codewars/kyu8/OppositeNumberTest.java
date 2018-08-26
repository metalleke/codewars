package net.metalleke.codewars.kyu8;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OppositeNumberTest {

    @Test
    public void tests() {
        assertEquals(-1, OppositeNumber.opposite(1));
    }
}