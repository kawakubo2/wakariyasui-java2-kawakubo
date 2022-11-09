package chapter09;

import lib.Input;

public class Pass9_3 {
    public static void main(String[] args) {
        String s = Input.getString();
        System.out.println("ok".equals(s) || "OK".equals(s) ? "おめでとう！": "残念");
    }
}
