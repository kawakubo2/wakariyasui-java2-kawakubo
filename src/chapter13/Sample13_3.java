package chapter13;

import java.util.Arrays;

public class Sample13_3 {
    public static void main(String[] args) {
        int[] number = {33, 21, 55, 90, 18};
        Arrays.sort(number);
        for (int n: number) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
