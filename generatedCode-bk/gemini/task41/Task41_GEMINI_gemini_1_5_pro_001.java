package gemini.task41;

import java.util.Scanner;

public class Task41_GEMINI_gemini_1_5_pro_001 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        scanner.close();

        String processedString = processString(inputString);
        System.out.println("Processed string: " + processedString);
    }

    private static String processString(String inputString) {
        // Implement your string processing logic here
        // For example, converting the input string to uppercase
        return inputString.toUpperCase();
    }
}