package chapter06;

import lib.Input;

public class Pass6_2 {
    public static void main(String[] args) {
        double a = Input.getDouble("a");
        double b = Input.getDouble("b");
        double c = Input.getDouble("c");

        double d = Math.pow(b, 2) - 4 * a * c;
        double ans = Math.sqrt(d);
        System.out.printf("ans=%5.3f%n", ans);
    }
}
