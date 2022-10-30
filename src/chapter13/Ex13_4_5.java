package chapter13;

import java.util.Arrays;

public class Ex13_4_5 {
    public static void main(String[] args) {
        double[] data = { 2.8, -3.3, 1.5, -5.2, 4.2, 8.1 };
        System.out.println("合計=" + Arrays.stream(data).filter(d -> d > 0).sum());
    }
}
