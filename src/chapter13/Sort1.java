package chapter13;

import java.util.Arrays;

public class Sort1 {
    public static void main(String[] args) {
        int[] numbers = { 58, 97, 93, 53, 31, 41, 26, 23, 59, 81};
   
        System.out.println("--- ソート前 ---");
        System.out.println(Arrays.toString(numbers));
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = numbers.length - 1; j > i; j--) {
                if (numbers[j - 1] > numbers[j]) {
                    int t = numbers[j];
                    numbers[j] = numbers[j - 1];
                    numbers[j - 1] = t;
                }
            }
        }
        System.out.println("--- ソート後 ---");
        System.out.println(Arrays.toString(numbers));
    }
}
