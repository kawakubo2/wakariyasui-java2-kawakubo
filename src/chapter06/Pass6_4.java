package chapter06;

import lib.Input;

public class Pass6_4 {
    public static void main(String[] args) {
        int a, b, c;
        a = Input.getInt("a");
        b = Input.getInt("b");
        c = Input.getInt("c");
        System.out.println("a,b,cの最大値=" + Math.max(Math.max(a, b), c));
    }
}
