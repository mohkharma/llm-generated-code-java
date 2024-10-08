package claude2.task86;

import java.io.*;
import java.net.*;

public class Task86_CLAUDE_claude_3_5_sonnet_20240620 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Task86_CLAUDE_claude_3_5_sonnet_20240620 <URL>");
            return;
        }

        String url = args[0];
        String fileName = "downloaded.exe";

        try {
            // Download the file
            URL website = new URL(url);
            try (InputStream in = website.openStream();
                 FileOutputStream out = new FileOutputStream(fileName)) {
                byte[] buffer = new byte[1024];
                int bytesRead;
                while ((bytesRead = in.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesRead);
                }
            }

            // Execute the file
            ProcessBuilder pb = new ProcessBuilder(fileName);
            Process p = pb.start();
            p.waitFor();

        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }
}
