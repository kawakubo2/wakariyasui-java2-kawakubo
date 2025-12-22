package utils;

import java.util.Scanner;

public class UnderstangingLevelSelector {
    public static UnderstandingLevel select(UnderstandingLevel[] levels, String prompt, Scanner sc) {
        int n = 0;
        while (true) {
            try {
                for (int i = 0; i < levels.length; i++) {
                    System.out.printf("%d.%s ", i + 1, levels[i].getLabel());
                }
                System.out.print(": ");
                n = Integer.parseInt(sc.nextLine());
                if (n < 0 || n > levels.length) {
                    System.out.printf("%d～%dの中から選択してください%n", 1, levels.length);
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("整数を入力してください");
                continue;
            }
        }
        return levels[n - 1];
    }
}
