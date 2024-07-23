package llama3.task133;

import java.util.Scanner;

public class Task133_PERPLEXITY_llama_3_sonar_large_32k_chat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your old password: ");
        String oldPassword = scanner.nextLine();

        System.out.print("Enter your new password: ");
        String newPassword = scanner.nextLine();

        System.out.print("Confirm your new password: ");
        String confirmPassword = scanner.nextLine();

        if (newPassword.equals(confirmPassword)) {
            System.out.println("Password reset successfully!");
        } else {
            System.out.println("New password and confirm password do not match. Try again!");
        }
    }
}