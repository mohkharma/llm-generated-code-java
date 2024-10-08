package llama3.task167;

public class Task167_PERPLEXITY_llama_3_sonar_large_32k_chat {
    public static void main(String[] args) {
        System.out.printf("%.2f%n", cubeDiagonal(8));  // 3.46
        System.out.printf("%.2f%n", cubeDiagonal(343));  // 12.12
        System.out.printf("%.2f%n", cubeDiagonal(1157.625));  // 18.19
    }
    public static double cubeDiagonal(double volume) {
        return Math.round(Math.sqrt(3) * Math.pow(volume, 1. / 3) * 100.) / 100.;
    }
}