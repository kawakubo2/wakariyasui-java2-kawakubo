package chapter08;

import lib.Input;

public class Pass8_4 {
    public static void main(String[] args) {
        String str = Input.getString();
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));
        }
        System.out.println();
    }
}
