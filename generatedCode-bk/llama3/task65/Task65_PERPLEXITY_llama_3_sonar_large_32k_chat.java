package llama3.task65;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task65_PERPLEXITY_llama_3_sonar_large_32k_chat {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Task65_PERPLEXITY_llama_3_sonar_large_32k_chat <filename>");
            return;
        }
        String filename = args[0];
        if (!isValidFilename(filename)) {
            System.out.println("Invalid filename format");
            return;
        }
        try {
            File file = new File(filename);
            if (!file.exists()) {
                System.out.println("File does not exist");
                return;
            }
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }

    private static boolean isValidFilename(String filename) {
        // Add your filename validation logic here
        return true;
    }
}