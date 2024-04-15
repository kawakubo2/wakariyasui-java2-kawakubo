package chapter06;

import lib.Input;

public class Ex6_8_1 {
    public static void main(String[] args) {
        int a = Input.getInt("単価を入力してください");
        double b = Input.getDouble("体重");
        String c = Input.getString("名前");

        System.out.printf("%,10d%n", a);
        System.out.printf("%10.3f%n", b);
        System.out.printf("%10s%n", c);
    }
}
