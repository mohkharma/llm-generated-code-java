package llama3.task36;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task36_PERPLEXITY_llama_3_sonar_large_32k_chat {
    public static void main(String[] args) {
        System.out.print("Enter file name: ");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        String fileName = scanner.nextLine();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}