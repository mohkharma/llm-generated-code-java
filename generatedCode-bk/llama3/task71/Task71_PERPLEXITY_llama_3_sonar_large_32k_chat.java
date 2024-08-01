package llama3.task71;

public class Task71_PERPLEXITY_llama_3_sonar_large_32k_chat {
    public static void main(String[] args) {
        if (args.length > 0) {
            try {
                int num = Integer.parseInt(args[0]);
                System.out.println("The integer value is: " + num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
            }
        } else {
            System.out.println("No input provided.");
        }
    }
}