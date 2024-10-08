package claude2.task77;

import org.apache.commons.net.ftp.FTPClient;
import java.io.*;

public class Task77_CLAUDE_claude_3_5_sonnet_20240620 {
    public static void main(String[] args) {
        if (args.length != 4) {
            System.out.println("Usage: java Task77_CLAUDE_claude_3_5_sonnet_20240620 <hostname> <username> <password> <filename>");
            return;
        }

        String server = args[0];
        String user = args[1];
        String pass = args[2];
        String remoteFile = args[3];

        FTPClient ftpClient = new FTPClient();
        try {
            ftpClient.connect(server);
            ftpClient.login(user, pass);
            ftpClient.enterLocalPassiveMode();

            String remoteFilePath = "/" + remoteFile;
            File downloadFile = new File(remoteFile);
            OutputStream outputStream = new BufferedOutputStream(new FileOutputStream(downloadFile));
            boolean success = ftpClient.retrieveFile(remoteFilePath, outputStream);
            outputStream.close();

            if (success) {
                System.out.println("File downloaded successfully.");
            } else {
                System.out.println("Failed to download the file.");
            }

            ftpClient.logout();
            ftpClient.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
