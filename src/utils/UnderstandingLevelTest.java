package utils;

import java.util.Scanner;

public class UnderstandingLevelTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UnderstandingLevel[] levels = UnderstandingLevel.values();
        int n = InputUtil.selectUnderstandingLevel(levels, "理解度", sc);
        System.out.println("n=" + n);
    }
}
