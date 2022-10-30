package chapter13;

import lib.Input;

public class Sample13_8 {
    public static void main(String[] args) {
        int[][] drink = new int[2][4];
        for (int i = 0; i < drink.length; i++) {
            for(int j = 0; j < drink[i].length; j++) {
                drink[i][j] = Input.getInt();
            }
        }
        for(int[] row: drink) {
            for (int n: row) {
                System.out.print(n + "\t");
            }
            System.out.println();
        }
    }
}
