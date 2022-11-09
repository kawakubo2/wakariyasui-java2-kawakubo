package chapter09;

import lib.Input;

public class Exec9_7_1 {
    public static void main(String[] args) {
        double num = Input.getDouble();
        // 解法1
        if (num > 0) {
            System.out.println(Math.sqrt(num));
        } else {
            System.out.println(0);
        }
        // 解法2
        System.out.println(num > 0 ? Math.sqrt(num) : 0);

    }
}
