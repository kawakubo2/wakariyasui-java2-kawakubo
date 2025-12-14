package chapter11;

import lib.Input;

public class Test2 {
    public static void main(String[] args) {
        int n = Input.getInt("賛成(1)");
        if (n == 1) {
            System.out.println("賛成");
        } else {
            System.out.println("反対");
        }
    }
}
