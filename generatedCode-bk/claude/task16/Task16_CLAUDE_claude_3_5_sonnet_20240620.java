package claude.task16;

public class Task16_CLAUDE_claude_3_5_sonnet_20240620 {
    public static boolean solution(String str, String ending) {
        return str.endsWith(ending);
    }

    public static void main(String[] args) {
        System.out.println(solution("abc", "bc")); // true
        System.out.println(solution("abc", "d")); // false
    }
}
