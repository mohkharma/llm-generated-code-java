package gtp4o.task69;

import java.io.File;

public class Task69_OPENAI_gpt_4o {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide the file path as an argument.");
            return;
        }
        String filePath = args[0];
        File file = new File(filePath);
        if (file.delete()) {
            System.out.println("File deleted successfully.");
        } else {
            System.out.println("Failed to delete the file.");
        }
    }
}