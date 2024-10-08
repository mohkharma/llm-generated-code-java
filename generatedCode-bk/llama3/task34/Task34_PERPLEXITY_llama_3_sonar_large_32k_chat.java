package llama3.task34;

public class Task34_PERPLEXITY_llama_3_sonar_large_32k_chat {
    public static boolean isNarcissistic(int n) {
        int sum = 0, temp = n;
        int digits = String.valueOf(n).length();
        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == n;
    }
    public static void main(String[] args) {
        System.out.println(isNarcissistic(153)); // true
        System.out.println(isNarcissistic(1652)); // false
    }
}