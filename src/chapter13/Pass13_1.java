package chapter13;

import java.util.Arrays;

public class Pass13_1 {
    public static void main(String[] args) {
        double[] temp = { 20.5, 23.4, 26.1, 28.5, 33.5, 29.1 };
        System.out.println(Arrays.toString(temp));

        int[][] sales = {
            { 120, 130, 100, 110 },
            { 250, 230, 230, 240 },
            { 105, 110, 120, 125 }
        };
        for (int i = 0; i < sales.length; i++) {
            System.out.println(Arrays.toString(sales[i]));
        }
    }
}
