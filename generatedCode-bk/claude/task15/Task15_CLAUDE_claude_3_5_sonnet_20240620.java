package claude.task15;

import java.util.ArrayList;
import java.util.List;

public class Task15_CLAUDE_claude_3_5_sonnet_20240620 {
    public static List<String> towerBuilder(int nFloors) {
        List<String> tower = new ArrayList<>();
        for (int i = 0; i < nFloors; i++) {
            String floor = " ".repeat(nFloors - i - 1) +
                           "*".repeat(2 * i + 1) +
                           " ".repeat(nFloors - i - 1);
            tower.add(floor);
        }
        return tower;
    }

    public static void main(String[] args) {
        List<String> tower = towerBuilder(6);
        for (String floor : tower) {
            System.out.println(floor);
        }
    }
}
