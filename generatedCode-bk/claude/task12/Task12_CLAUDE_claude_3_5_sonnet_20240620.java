package claude.task12;

import java.util.Scanner;

public class Task12_CLAUDE_claude_3_5_sonnet_20240620 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] words = input.split(" ");
        String highestScoringWord = "";
        int highestScore = 0;

        for (String word : words) {
            int score = calculateScore(word);
            if (score > highestScore) {
                highestScore = score;
                highestScoringWord = word;
            }
        }

        System.out.println(highestScoringWord);
    }

    private static int calculateScore(String word) {
        int score = 0;
        for (char c : word.toCharArray()) {
            score += c - 'a' + 1;
        }
        return score;
    }
}
