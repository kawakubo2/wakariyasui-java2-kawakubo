package chapter10;

import lib.Input;

public class Pass10_2 {
    public static void main(String[] args) {
        double x, total = 0.0;
        int count = 0;
        while ((x = Input.getDouble()) != 0) {
            total += x;
            count++;
        }
        System.out.printf("合計=%6.2f%n", total);
        System.out.printf("件数=%3d%n", count);
        System.out.printf("平均=%6.2f%n", total / count);
    }
}
