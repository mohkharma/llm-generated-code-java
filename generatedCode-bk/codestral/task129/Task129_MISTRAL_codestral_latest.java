package codestral.task129;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.util.Scanner;

public class Task129_MISTRAL_codestral_latest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the file name: ");
        String fileName = scanner.nextLine();
        String url = "http://example.com/" + fileName;
        downloadFile(url, fileName);
    }

    private static void downloadFile(String urlStr, String fileName) {
        try {
            URL url = new URL(urlStr);
            ReadableByteChannel rbc = Channels.newChannel(url.openStream());
            FileOutputStream fos = new FileOutputStream(fileName);
            fos.getChannel().transferFrom(rbc, 0, Long.MAX_VALUE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}