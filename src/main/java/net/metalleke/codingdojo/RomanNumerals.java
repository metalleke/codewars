package net.metalleke.codingdojo;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class RomanNumerals {

    private static final Map<Integer, String> LETTER_VALUES = new HashMap<>();

    static {
        LETTER_VALUES.put(1000, "M");
        LETTER_VALUES.put(900, "CM");
        LETTER_VALUES.put(500, "D");
        LETTER_VALUES.put(400, "CD");
        LETTER_VALUES.put(100, "C");
        LETTER_VALUES.put(90, "XC");
        LETTER_VALUES.put(50, "L");
        LETTER_VALUES.put(40, "XL");
        LETTER_VALUES.put(10, "X");
        LETTER_VALUES.put(9, "IX");
        LETTER_VALUES.put(5, "V");
        LETTER_VALUES.put(4, "IV");
        LETTER_VALUES.put(1, "I");
    }

    public static String convert_to_roman_numerals(Integer input) {
        final StringBuilder result = new StringBuilder();
        final AtomicInteger currentValue = new AtomicInteger(input);

        LETTER_VALUES
                .keySet()
                .stream()
                .sorted(Comparator.reverseOrder())
                .forEach(value -> {
                    while (currentValue.intValue() >= value) {
                        currentValue.set(currentValue.intValue() - value);
                        result.append(LETTER_VALUES.get(value));
                    }
                });

        return result.toString();
    }
}