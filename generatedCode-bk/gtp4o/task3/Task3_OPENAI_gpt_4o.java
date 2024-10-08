package gtp4o.task3;// Java
import java.util.HashSet;
import java.util.Set;

public class Task3_OPENAI_gpt_4o {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println(isPangram(sentence));
    }

    public static boolean isPangram(String sentence) {
        Set<Character> alphabetSet = new HashSet<>();
        for (char ch : sentence.toLowerCase().toCharArray()) {
            if (Character.isLetter(ch)) {
                alphabetSet.add(ch);
            }
        }
        return alphabetSet.size() == 26;
    }
}