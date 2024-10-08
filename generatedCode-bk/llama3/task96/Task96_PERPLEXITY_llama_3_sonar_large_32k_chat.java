package llama3.task96;

import java.net.*;
import java.io.*;

public class Task96_PERPLEXITY_llama_3_sonar_large_32k_chat {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8000);
        System.out.println("Server is running...");
        Socket socket = serverSocket.accept();
        System.out.println("Client connected...");

        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

        String inputLine;
        while ((inputLine = reader.readLine()) != null) {
            System.out.println("Server: " + inputLine);
            writer.println("Echo: " + inputLine);
        }
    }
}