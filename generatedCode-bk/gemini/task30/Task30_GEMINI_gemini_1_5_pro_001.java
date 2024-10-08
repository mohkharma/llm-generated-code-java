package gemini.task30;

import java.util.Arrays;

public class Task30_GEMINI_gemini_1_5_pro_001 {
    public static String longest(String s1, String s2) {
        boolean[] seen = new boolean[26];
        StringBuilder sb = new StringBuilder();
        for (char c : (s1 + s2).toCharArray()) {
            int index = c - 'a';
            if (!seen[index]) {
                sb.append(c);
                seen[index] = true;
            }
        }
        char[] arr = sb.toString().toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }

    public static void main(String[] args) {
        System.out.println(longest("xyaabbbccccdefww", "xxxxyyyyabklmopq"));
        System.out.println(longest("abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz"));
    }
}