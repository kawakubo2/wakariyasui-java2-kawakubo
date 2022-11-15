package chapter12;

public class Ex12_1_1 {
    public static void main(String[] args) {
        int[] menu = { 10, 11, 51, 52, 60, 61, 70 };
        System.out.println("---< switch文 >---");
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

        System.out.println("--- switch式 ---");
        for (int s : menu) {
            String menuName = switch (s) {
                case 10 -> "ハンバーガー";
                case 11 -> "ポテトフライ";
                case 51 -> "バニラシェーク";
                case 52 -> "コーラ";
                case 60, 61 -> "セットメニュー";
                default -> "入力エラー";
            };
            System.out.println(menuName);
        }

    }
}
