package chapter11;

public class Greeting {
    public static void main(String[] args) {
        // int hour = Input.getInt("時刻");
        int[] hours = {-1, 24, 0, 11, 7, 12, 13, 18, 15, 19, 23, 21};
        for (int hour: hours) {
            System.out.printf("======< 時刻: %2d時 >>======%n", hour);
            System.out.println("---< 解法1 >---");
            if (hour >= 0 && hour <= 11) {
                System.out.println("おはようございます。");    
            } else if (hour == 12) {
                System.out.println("お昼です。");
            } else if (hour >= 13 && hour <= 18) {
                System.out.println("こんにちは");
            } else if (hour >= 19 && hour <= 23) {
                System.out.println("こんばんは。");
            } else {
                System.out.println("時刻の範囲を超えています。");
            }

            System.out.println("\n---< 解法2 >---");
            if (hour < 0 || hour > 23) {
                System.out.println("時刻の範囲を超えています。");
            } else if (hour <= 11) {
                System.out.println("おはようございます。");
            } else if (hour == 12) {
                System.out.println("お昼です。");
            } else if (hour <= 18) {
                System.out.println("こんにちは。");
            } else {
                System.out.println("こんばんは。");
            }
        }
    }
}
