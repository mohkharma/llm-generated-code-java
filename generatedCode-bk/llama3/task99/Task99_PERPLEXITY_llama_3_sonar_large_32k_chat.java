package llama3.task99;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Task99_PERPLEXITY_llama_3_sonar_large_32k_chat {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("input.txt"))) {
            String line;
            Pattern p = Pattern.compile("^[0-9]+.*\\.$");
            while ((line = br.readLine()) != null) {
                Matcher m = p.matcher(line);
                if (m.matches()) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}