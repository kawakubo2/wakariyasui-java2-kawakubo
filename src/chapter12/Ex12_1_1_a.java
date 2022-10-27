package chapter12;

public class Ex12_1_1_a {
    public static void main(String[] args) {
        int[] menu = { 10, 11, 51, 52, 60, 61, 70 };
        for (int s : menu) {
            switch (s) {
                case 10:
                    System.out.println("ハンバーガー");
                    break;
                case 11:
                    System.out.println("ポテトフライ");
                    break;
                case 51:
                    System.out.println("バニラシェーク");
                    break;
                case 52:
                    System.out.println("コーラ");
                    break;
                case 60:
                case 61:
                    System.out.println("セットメニュー");
                    break;
                default:
                    System.out.println("入力エラー");
                    break;
            }
        }
    }
}
