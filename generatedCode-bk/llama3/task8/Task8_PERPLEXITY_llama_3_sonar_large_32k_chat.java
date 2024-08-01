package llama3.task8;

public class Task8_PERPLEXITY_llama_3_sonar_large_32k_chat {
    public static void main(String[] args) {
        char[] arr = {'a','b','c','d','f'};
        System.out.println(findMissingLetter(arr));
    }

    public static char findMissingLetter(char[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] - array[i] > 1) {
                return (char) (array[i] + 1);
            }
        }
        return ' ';
    }
}