package codestral.task108;// Java
import java.io.*;
import java.net.*;

public class Task108_MISTRAL_codestral_latest {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(8080);
        Socket clientSocket = serverSocket.accept();
        ObjectOutputStream out = new ObjectOutputStream(clientSocket.getOutputStream());
        ObjectInputStream in = new ObjectInputStream(clientSocket.getInputStream());
        // Add your object manipulation logic here
    }
}