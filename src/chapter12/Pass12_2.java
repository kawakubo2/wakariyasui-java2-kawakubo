package chapter12;

public class Pass12_2 {
    public static void main(String[] args) {
        for (int month = -1; month <= 13; month++) {
            String season = switch(month) {
                case 12,  1,  2 -> "冬";
                case  3,  4,  5 -> "春";
                case  6,  7,  8 -> "夏";
                case  9, 10, 11 -> "秋";
                default -> "入力エラー";
            };
            System.out.printf("季節は%sです。%n", season);
        }
    }
}
