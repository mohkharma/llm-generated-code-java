package codestral.task18;

public class Task18_MISTRAL_codestral_latest {
    public static int binaryArrayToNumber(int[] arr) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result * 2 + arr[i];
        }
        return result;
    }
}