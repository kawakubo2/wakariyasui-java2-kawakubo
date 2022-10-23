package chapter09;

import lib.Input;

public class Exec9_7_1 {
    public static void main(String[] args) {
        double num = Input.getDouble();
        if (num > 0) {
            System.out.println(Math.sqrt(num));
        } else {
            System.out.println(0);
        }
    }
}
