package claude.task166;

import java.util.*;

public class Task166_CLAUDE_claude_3_5_sonnet_20240620 {
    public static List<Integer> posNegSort(List<Integer> arr) {
        List<Integer> pos = new ArrayList<>();
        for (int num : arr) {
            if (num > 0) {
                pos.add(num);
            }
        }
        Collections.sort(pos);
        
        List<Integer> result = new ArrayList<>();
        int posIndex = 0;
        for (int num : arr) {
            if (num > 0) {
                result.add(pos.get(posIndex++));
            } else {
                result.add(num);
            }
        }
        return result;
    }
}
