package net.metalleke.hackerrank;

import java.io.*;
import java.util.*;

public class ClimbingTheLeaderboard {

    // Complete the climbingLeaderboard function below.
    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] uniqueScores = Arrays.stream(scores).distinct().toArray();

        int[] result = new int[alice.length];
        int lastIndex = 0;

        for (int i = 0; i < alice.length; i++) {
            int tempScore = alice[i];

            if(uniqueScores[uniqueScores.length - 1] == tempScore) {
                result[i] = uniqueScores.length;
            } else if(uniqueScores[uniqueScores.length - 1] >= tempScore) {
                result[i] = uniqueScores.length + 1;
            } else if(uniqueScores[0] <= tempScore) {
                result[i] = 1;
            } else {
                int start = (lastIndex == 0 ? uniqueScores.length - 1 : lastIndex);
                lastIndex = calculateNewIndex(uniqueScores, tempScore, start);
                result[i] = lastIndex + 1;
            }
        }

        return result;
    }

    private static int calculateNewIndex(int[] uniqueScores, int tempScore, int start) {
        for (int j = start; j > 0; j--) {
            if(uniqueScores[j] <= tempScore && uniqueScores[j - 1] > tempScore) {
                return j;
            }
        }

        return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int scoresCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[scoresCount];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < scoresCount; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int aliceCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] alice = new int[aliceCount];

        String[] aliceItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < aliceCount; i++) {
            int aliceItem = Integer.parseInt(aliceItems[i]);
            alice[i] = aliceItem;
        }

        int[] result = climbingLeaderboard(scores, alice);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
