package gtp4o.task57;

import java.util.Scanner;

public class Task57_OPENAI_gpt_4o {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        long result = factorial(number);
        System.out.println("Factorial: " + result);
    }

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }
}