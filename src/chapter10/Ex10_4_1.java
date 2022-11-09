package chapter10;

import lib.Input;

public class Ex10_4_1 {
    public static void main(String[] args) {
        double total = 0, n; 
        int count = 0;
        while ((n = Input.getDouble()) != 0) {
            total += n;
            count++;
        }
        System.out.printf("合計=%6.3f%n", total);
        System.out.printf("平均=%6.3f%n", total / count);
    }
}
