package chapter06;

import lib.Input;

public class Pass6_4_2 {
    public static void main(String[] args) {
        int a, b, c, max;
        a = Input.getInt("a");
        b = Input.getInt("b");
        c = Input.getInt("c");
        System.out.println(Math.max(Math.max(a, b), c));
        max = Math.max(a, b);
        max = Math.max(max, c);
        System.out.println(max);
    }
}
