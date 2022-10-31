package chapter13;

import java.util.Arrays;

public class Pass13_2_4 {
    public static void main(String[] args) {
        double[] temp = { 20.5, 23.4, 26.1, 28.5, 33.5, 29.1 };
        Arrays.stream(temp)
            .filter(t -> t >= 28)
            .forEach(System.out::println);
    }
}
