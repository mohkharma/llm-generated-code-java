package claude.task58;

public class Task58_CLAUDE_claude_3_5_sonnet_20240620 {
    public static boolean getXO(String str) {
        str = str.toLowerCase();
        int x = 0, o = 0;
        for (char c : str.toCharArray()) {
            if (c == 'x') x++;
            if (c == 'o') o++;
        }
        return x == o;
    }

    public static void main(String[] args) {
        System.out.println(getXO("ooxx"));
        System.out.println(getXO("xooxx"));
        System.out.println(getXO("ooxXm"));
        System.out.println(getXO("zpzpzpp"));
        System.out.println(getXO("zzoo"));
    }
}
