package llama3.task100;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task100_PERPLEXITY_llama_3_sonar_large_32k_chat {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java Task100_PERPLEXITY_llama_3_sonar_large_32k_chat <pattern> <file>");
            return;
        }
        String pattern = args[0];
        String file = args[1];
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            Pattern p = Pattern.compile(pattern);
            while ((line = br.readLine()) != null) {
                Matcher m = p.matcher(line);
                while (m.find()) {
                    System.out.println(m.group());
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}