package chapter12;

import lib.Input;

public class Ex12_3_1 {
    public static void main(String[] args) {
        int n = Input.getInt();
        String fruitName = switch (n) {
            case 100 -> "イチゴ";
            case 110 -> "パイン";
            case 120 -> "メロン";
            default -> "??";
        };
        System.out.println(fruitName);
    }
}
