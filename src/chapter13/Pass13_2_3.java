package chapter13;

import java.util.Arrays;

public class Pass13_2_3 {
    public static void main(String[] args) {
        double[] temp = { 20.5, 23.4, 26.1, 28.5, 33.5, 29.1 };
        double total = Arrays.stream(temp).sum();
        long count = Arrays.stream(temp).count();
        System.out.printf("平均=%.2f%n", total / count);
    }
}
