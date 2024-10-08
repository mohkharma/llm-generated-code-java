package llama3.task119;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task119_PERPLEXITY_llama_3_sonar_large_32k_chat {
    public static void main(String[] args) {
        String csvFile = "example.csv";
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] country = line.split(cvsSplitBy);
                System.out.println("Country [code= " + country[0] + " , name=" + country[1] + "]");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}