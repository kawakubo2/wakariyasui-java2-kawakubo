package utils;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class InputUtilTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            LinkedHashMap<Integer, String> m = new LinkedHashMap<>();
            m.put(1, "リンゴ");
            m.put(2, "バナナ");
            m.put(3, "パイナップ");
            m.put(9, "終了");
            int n = InputUtil.menu(m, "好きな食べ物は", sc);
            System.out.println("n=" + n);
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("-----------------");
        int score = InputUtil.range(0, 100, "点数", sc);
        System.out.println("score=" + score);
    }
}
