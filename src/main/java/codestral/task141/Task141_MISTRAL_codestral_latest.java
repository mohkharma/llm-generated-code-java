package codestral.task141;

import java.util.Scanner;

public class Task141_MISTRAL_codestral_latest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();
        String reversedString = new StringBuilder(inputString).reverse().toString();
        System.out.println("Reversed string is: " + reversedString);
    }
}