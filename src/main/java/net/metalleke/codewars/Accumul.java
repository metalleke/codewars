package net.metalleke.codewars;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Accumul {

    public static String accum(String s) {
        AtomicInteger counter = new AtomicInteger(0);
        return Arrays.stream(s.split(""))
                .map(j -> {
                    return j.toUpperCase() + Stream.generate(() -> j.toLowerCase()).limit(counter.getAndIncrement()).collect(Collectors.joining());
                })
                .collect(Collectors.joining("-"));
    }
}