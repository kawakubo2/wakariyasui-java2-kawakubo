package chapter06;

import lib.Input;

public class Pass6_2 {
    public static void main(String[] args) {
        double a = Input.getDouble("a");
        double b = Input.getDouble("b");
        double c = Input.getDouble("c");

        double d = Math.pow(b, 2) - 4 * a * c;
        if (d < 0) {
            System.err.println("計算結果が負数です");
            System.exit(1);
        }
        double ans = Math.sqrt(d);
        System.out.printf("ans=%5.3f%n", ans);
    }
}
