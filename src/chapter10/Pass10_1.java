package chapter10;

import lib.Input;

public class Pass10_1 {
    public static void main(String[] args) {
        String str;
        while ((str = Input.getString()) != null) {
            System.out.printf("<%d>%s%n", str.length(), str);
        }
    }
}
