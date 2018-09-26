package net.metalleke.codingdojo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanNumeralsTest {

    @Test
    void convert_to_roman_numerals() {
        assertEquals("", RomanNumerals.convert_to_roman_numerals(0));
        assertEquals("I", RomanNumerals.convert_to_roman_numerals(1));
        assertEquals("II", RomanNumerals.convert_to_roman_numerals(2));
        assertEquals("III", RomanNumerals.convert_to_roman_numerals(3));
        assertEquals("IV", RomanNumerals.convert_to_roman_numerals(4));
        assertEquals("V", RomanNumerals.convert_to_roman_numerals(5));
        assertEquals("VI", RomanNumerals.convert_to_roman_numerals(6));
        assertEquals("VII", RomanNumerals.convert_to_roman_numerals(7));
        assertEquals("VIII", RomanNumerals.convert_to_roman_numerals(8));
        assertEquals("IX", RomanNumerals.convert_to_roman_numerals(9));
        assertEquals("X", RomanNumerals.convert_to_roman_numerals(10));
        assertEquals("XI", RomanNumerals.convert_to_roman_numerals(11));
        assertEquals("XIV", RomanNumerals.convert_to_roman_numerals(14));
        assertEquals("XL", RomanNumerals.convert_to_roman_numerals(40));
        assertEquals("L", RomanNumerals.convert_to_roman_numerals(50));
        assertEquals("XC", RomanNumerals.convert_to_roman_numerals(90));
        assertEquals("C", RomanNumerals.convert_to_roman_numerals(100));
        assertEquals("CCLVI", RomanNumerals.convert_to_roman_numerals(256));
        assertEquals("CD", RomanNumerals.convert_to_roman_numerals(400));
        assertEquals("D", RomanNumerals.convert_to_roman_numerals(500));
        assertEquals("CM", RomanNumerals.convert_to_roman_numerals(900));
        assertEquals("M", RomanNumerals.convert_to_roman_numerals(1000));
    }
}