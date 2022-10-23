package chapter10;

import lib.Input;

public class Pass10_3 {
    public static void main(String[] args) {
        double x;
        int count = 0;
        while ((x = Input.getDouble()) != 0) {
            count += x >= 10.0 ? 1 : 0;
            // if (x >= 10.0) count++;
        }
        System.out.printf("件数: %d%n", count);
    }
}
