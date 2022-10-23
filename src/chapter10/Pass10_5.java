package chapter10;

import lib.Input;

public class Pass10_5 {
    public static void main(String[] args) {
        do {
            System.out.println(Math.random());
        } while (Input.getInt() != 0);
    }
}
