package chapter12;

import lib.Input;

public class Ex12_1_2 {
    public static void main(String[] args) {
        String str = Input.getString();
        switch (str) {
            case "yesterday" -> System.out.println("昨日");
            case "today" -> System.out.println("今日");
            case "tomorrow" -> System.out.println("明日");
            default -> System.out.println("不明\nstr=" + str);
        }
    }
}
