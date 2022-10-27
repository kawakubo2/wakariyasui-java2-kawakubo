package chapter12;

public class Ex12_1_1 {
    public static void main(String[] args) {
        int[] menu = { 10, 11, 51, 52, 60, 61, 70 };
        for (int s : menu) {
            switch (s) {
                case 10 -> System.out.println("ハンバーガー");
                case 11 -> System.out.println("ポテトフライ");
                case 51 -> System.out.println("バニラシェーク");
                case 52 -> System.out.println("コーラ");
                case 60, 61 -> System.out.println("セットメニュー");
                default -> System.out.println("入力エラー");
            }
        }

    }
}
