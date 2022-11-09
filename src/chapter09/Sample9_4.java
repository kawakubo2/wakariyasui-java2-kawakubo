package chapter09;

import lib.Input;

public class Sample9_4 {
    public static void main(String[] args) {
        int w = Input.getInt("体重");
        int h = Input.getInt("身長");
        System.out.println();

        boolean b1 = w >= 90 && h >= 180;
        boolean b2 = w >= 90 || h >= 180;
        boolean b3 = w >= 90 ^ h >= 180;
        boolean b4 = !(w >= 90);

        System.out.println("w >= 90 && h >= 180 ---> " + b1);
        System.out.println("b2 = w >= 90 || h >= 180 ---> " + b2);
        System.out.println("boolean b3 = w >= 90 ^ h >= 180 ---> " + b3);
        System.out.println("boolean b4 = !(w >= 90) ---> " + b4);
    }
}
