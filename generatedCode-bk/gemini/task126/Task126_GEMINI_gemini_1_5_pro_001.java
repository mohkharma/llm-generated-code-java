package gemini.task126;

import java.util.Scanner;

public class Task126_GEMINI_gemini_1_5_pro_001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your destination (A/B/C): ");
        String choice = scanner.nextLine();

        if (choice.toUpperCase().equals("A")) {
            System.out.println("https://www.exampleA.com");
        } else if (choice.toUpperCase().equals("B")) {
            System.out.println("https://www.exampleB.com");
        } else if (choice.toUpperCase().equals("C")) {
            System.out.println("https://www.exampleC.com");
        } else {
            System.out.println("Invalid choice.");
        }
    }
}