package net.metalleke.codewars.kyu8;

import java.util.List;
import java.util.stream.Collectors;

public class TwoToOne {

    public static String longest (String s1, String s2) {
        List<Character> l1 = s1.chars().distinct().sorted().mapToObj(c -> (char)c).collect(Collectors.toList());
        List<Character> l2 = s2.chars().distinct().sorted().mapToObj(c -> (char)c).collect(Collectors.toList());

        System.out.println(
                "1:" + s1 + " -> " + l1.stream().map(c -> c.toString()).collect(Collectors.joining("")) + ": " + l1.size()
        );

        System.out.println(
                "2:" + s2 + " -> " + l2.stream().map(c -> c.toString()).collect(Collectors.joining("")) + ": " + l2.size()
        );


        if(l1.size() > l2.size()) {
            System.out.println("Printing: " + l1.stream().map(c -> c.toString()).collect(Collectors.joining("")));
            return l1.stream().map(c -> c.toString()).collect(Collectors.joining(""));
        }

        System.out.println("Printing: " + l2.stream().map(c -> c.toString()).collect(Collectors.joining("")));

        return l2.stream().map(c -> c.toString()).collect(Collectors.joining(""));
    }
}