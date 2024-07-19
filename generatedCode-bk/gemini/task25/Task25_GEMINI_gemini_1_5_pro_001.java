package gemini.task25;

public class Task25_GEMINI_gemini_1_5_pro_001 {
    public static void main(String[] args) {
        String[] input = {"a", "b", "c"};
        String[] result = number(input);
        for (String s : result) {
            System.out.println(s);
        }
    }
    public static String[] number(String[] lines) {
        String[] numberedLines = new String[lines.length];
        for (int i = 0; i < lines.length; i++) {
            numberedLines[i] = (i + 1) + ": " + lines[i];
        }
        return numberedLines;
    }
}