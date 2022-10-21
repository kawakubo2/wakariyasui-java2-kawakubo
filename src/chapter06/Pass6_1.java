package chapter06;

import lib.Input;

public class Pass6_1 {
    public static void main(String[] args) {
        double a = Input.getDouble("角度");
        System.out.printf("sin = %.3f%n", Math.sin(Math.toRadians(a)));
        System.out.printf("cos = %.3f%n", Math.cos(Math.toRadians(a)));
    }
}
