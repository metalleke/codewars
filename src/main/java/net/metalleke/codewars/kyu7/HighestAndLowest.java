package net.metalleke.codewars.kyu7;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HighestAndLowest {
    public static String HighAndLow(String numbers) {
        List<Integer> splitNumbers = Arrays.stream(numbers.split(" ")).map(s -> Integer.parseInt(s)).collect(Collectors.toList());

        int min = splitNumbers.stream().min(Integer::compare).get();
        int max = splitNumbers.stream().max(Integer::compare).get();

        return String.format("%d %d", max, min);
    }
}