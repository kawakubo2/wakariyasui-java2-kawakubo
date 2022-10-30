package chapter13;

import lib.Input;

public class Ex13_3_1 {
    public static void main(String[] args) {
        double[] data = new double[5];
        for (int i = 0; i < data.length; i++) {
            data[i] = Input.getDouble();
        }
        for (double d : data) {
            System.out.print(d + " ");
        }
        System.out.println();
    }
}
