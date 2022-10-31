package chapter13;

import java.util.Arrays;

public class Pass13_2_2 {
    public static void main(String[] args) {
        double[] temp = { 20.5, 23.4, 26.1, 28.5, 33.5, 29.1 };
        double[] tempCopy = Arrays.copyOf(temp, 12);
        for (double t: tempCopy) {
            System.out.print(t + "\t");
        }
        System.out.println();
    }
}
