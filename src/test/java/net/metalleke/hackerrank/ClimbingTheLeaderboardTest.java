package net.metalleke.hackerrank;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ClimbingTheLeaderboardTest {

    @Test
    public void exampleTest() {
        int[] scores = new int[7];
        scores[0] = 100;
        scores[1] = 100;
        scores[2] = 50;
        scores[3] = 40;
        scores[4] = 40;
        scores[5] = 20;
        scores[6] = 10;

        int[] alice = new int[4];
        alice[0] = 5;
        alice[1] = 25;
        alice[2] = 50;
        alice[3] = 120;

        int[] result = ClimbingTheLeaderboard.climbingLeaderboard(scores, alice);

        assertEquals(6, result[0]);
        assertEquals(4, result[1]);
        assertEquals(2, result[2]);
        assertEquals(1, result[3]);
    }

    @Test
    public void example2Test() throws IOException, URISyntaxException {
        String input = new String(Files.readAllBytes(Paths.get(ClimbingTheLeaderboardTest.class.getResource("/hackerrank/ClimbingTheLeaderboardExample2Input").toURI())), "UTF8");
        String output = new String(Files.readAllBytes(Paths.get(ClimbingTheLeaderboardTest.class.getResource("/hackerrank/ClimbingTheLeaderboardExample2Output").toURI())), "UTF8");

        String[] inputLines = input.split(System.lineSeparator());
        String[] outputLines = output.split(System.lineSeparator());

        int[] scores = Arrays.stream(inputLines[1].split(" ")).mapToInt(s -> Integer.parseInt(s)).toArray();
        int[] alice = Arrays.stream(inputLines[3].split(" ")).mapToInt(s -> Integer.parseInt(s)).toArray();

        int[] result = ClimbingTheLeaderboard.climbingLeaderboard(scores, alice);

        for (int i = 0; i < result.length; i++) {
            assertEquals(Integer.parseInt(outputLines[i]), result[i]);
        }
    }
}