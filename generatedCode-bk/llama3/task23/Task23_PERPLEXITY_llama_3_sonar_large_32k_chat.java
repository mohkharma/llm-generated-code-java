package llama3.task23;

public class Task23_PERPLEXITY_llama_3_sonar_large_32k_chat {
    public static long findNb(long m) {
        long n = 1;
        long sum = 0;
        while (sum < m) {
            sum += (long) Math.pow(n, 3);
            if (sum == m) {
                return n;
            }
            n++;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(findNb(1071225)); // 45
        System.out.println(findNb(91716553919377L)); // -1
    }
}