package utils;

import java.util.Scanner;

public class UnderstandingLevelSelectorTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UnderstandingLevel[] levels = UnderstandingLevel.values();
        UnderstandingLevel understandingLevel = UnderstangingLevelSelector.select(levels, "理解度", sc);
        System.out.println("level=" + understandingLevel.getLabel());
    }
}
