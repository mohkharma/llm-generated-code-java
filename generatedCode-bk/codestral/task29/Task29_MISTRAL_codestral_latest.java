package codestral.task29;

import java.util.HashMap;
import java.util.Map;

public class Task29_MISTRAL_codestral_latest {
    public static int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numMap.containsKey(target - numbers[i])) {
                return new int[]{numMap.get(target - numbers[i]), i};
            }
            numMap.put(numbers[i], i);
        }
        return new int[]{};
    }
}