package chapter12;

import lib.Input;

public class Sample12_4 {
    public static void main(String[] args) {
        int n = Input.getInt();
        String msg = switch (n) {
            case 10 -> "正常終了";
            case 20, 21 -> "エラー発生";
            default -> {
                System.out.println("誤入力された値=" + n);
                yield "未定義";
            }
        };
        System.out.println(msg);
    }
}
