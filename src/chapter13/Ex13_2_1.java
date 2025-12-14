package chapter13;

import lib.Input;

public class Ex13_2_1 {
    public static void main(String[] args) {
        int len;
        double[] data;
        len = Input.getInt("要素数");
        data = new double[len];
        for (double x: data) {
            System.out.println(x);
        }
    }
}
