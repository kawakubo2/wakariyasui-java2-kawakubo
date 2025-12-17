package utils;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Scanner;

public class InputUtil {
    public static int menu(LinkedHashMap<Integer, String> items, String prompt, Scanner sc) throws Exception {
        int n = -1;
        System.out.print(prompt + ": ");
        while (true) {
            try {
                for (int num : items.keySet()) {
                    System.out.print(num + "." + items.get(num) + " ");
                }
                System.out.print(": ");
                n = Integer.parseInt(sc.nextLine());
                if (!items.containsKey(n)) {
                    System.out.println(keys(items).toString()
                            + "の中から選択してください");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("整数値を入力してください");
                continue;
            } catch (Exception e) {
                System.out.println(e.getMessage());
                throw e;
            }
        }
        return n;
    }

    private static List<Integer> keys(LinkedHashMap<Integer, String> items) {
        List<Integer> list = new ArrayList<>();
        for (int n : items.keySet()) {
            list.add(n);
        }
        return list;
    }

    public static int range(int min, int max, String prompt, Scanner sc) {
        int n = -1;
        System.out.print(prompt + ": ");
        while (true) {
            try {
                System.out.printf("%d～%dの整数値を入力してください: ", min, max);
                n = Integer.parseInt(sc.nextLine());
                if (n < min || n > max) {
                    System.out.printf("%d～%dの範囲で入力してください%n", min, max);
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("整数値を入力してください");
                continue;
            }
        }
        return n;
    }

    public static int selectUnderstandingLevel(UnderstandingLevel[] levels, String prompt, Scanner sc) {
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
        return n;
    }
}