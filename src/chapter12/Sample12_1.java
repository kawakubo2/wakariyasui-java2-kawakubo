package chapter12;

import lib.Input;

public class Sample12_1 {
    public static void main(String[] args) {
        int n = Input.getInt();
        switch (n) {
            case 10 -> System.out.println("正常終了");
            case 20, 21 -> System.out.println("エラー発生");
            default -> System.out.println("未定義");
        }
    }
}
