package chapter13;

import lib.Input;

public class Pass13_5 {
    public static void main(String[] args) {
        String[][] meibo = new String[2][3];

        String[] header = { "名前", "所属", "住所" };
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                meibo[i][j] = Input.getString(header[j]);
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.printf("%-8s", header[i]);
        }
        System.out.println();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%-8s", meibo[i][j]);
            }
            System.out.println();
        }
    }
}
