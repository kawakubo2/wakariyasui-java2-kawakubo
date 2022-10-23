package chapter11;

import lib.Input;

public class Sample11_2 {
    public static void main(String[] args) {
        double x, y;
        x = y = Input.getDouble();
        if (x < 0) {
            x *= -1;
            y = Math.abs(y);
        }
        System.out.println(x + "の平方根=" + Math.sqrt(x));
        System.out.println(y + "の平方根=" + Math.sqrt(y));
    }
}
