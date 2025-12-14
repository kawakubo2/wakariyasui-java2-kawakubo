package chapter09.second;

import lib.Input;

public class Pass10_2 {
    public static void main(String[] args) {
        double d;
        double total = 0.0;
        int cnt = 0;
        while ((d = Input.getDouble()) != 0) {
            total += d;
            cnt++;
        }
        System.out.printf("合計 = %.2f%n", total);
        System.out.println("件数 = " + cnt);
        System.out.printf("平均 = %.2f%n", total / cnt);
    }
}
