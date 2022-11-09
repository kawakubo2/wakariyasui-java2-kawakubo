package chapter09;

import lib.Input;

public class Ex9_7_2 {
    public static void main(String[] args) {
        int n = Input.getInt();
        System.out.println(n % 2 == 0 ? "偶数": "奇数");
    }
}
