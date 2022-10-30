package chapter13;

import java.util.Arrays;

public class Sample13_5 {
    public static void main(String[] args) {
        int[] number = new int[5];
        Arrays.fill(number, 1);
        int[] numberCopy = Arrays.copyOf(number, 10);
        System.out.println(Arrays.toString(numberCopy));
    }
}
