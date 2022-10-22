package chapter08;

public class Pass8_1 {
    public static void main(String[] args) {
        double[] da = { 12.3, 13.5, 11.5, 13.0, 12.8, 12.5 };
        double total = 0.0;
        for (double d : da) {
            total += d;
        }
        System.out.printf("合計=%.1f%n", total);
        System.out.printf("平均=%.1f%n", total / da.length);
        for (double d : da) {
            System.out.print(d + "\t");
        }
        System.out.println();
    }
}
