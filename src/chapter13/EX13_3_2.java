package chapter13;

import lib.Input;

public class EX13_3_2 {
    public static void main(String[] args) {
        String[] str = new String[3];
        for (int i = 0; i < 3; i++) {
            str[i] = Input.getString();
        }
        for (String s: str) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
