package codestral.task1;

// Java
public class Task1_MISTRAL_codestral_latest {
    public static int countPassengers(int[][] stops) {
        int total = 0;
        for (int[] stop : stops) {
            total += stop[0] - stop[1];
        }
        return total;
    }
}