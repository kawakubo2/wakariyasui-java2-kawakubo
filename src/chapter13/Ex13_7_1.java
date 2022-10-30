package chapter13;

import lib.Input;

public class Ex13_7_1 {
    public static void main(String[] args) {
        double[][] mylist = new double[3][2];
        for (int i = 0; i < mylist.length; i++) {
            for (int j = 0; j < mylist[i].length; j++) {
                mylist[i][j] = Input.getDouble();
            }
        }
        for (double[] list: mylist) {
            for (double d: list) {
                System.out.printf("%5.1f", d);
            }
            System.out.println();
        }
    }
}
