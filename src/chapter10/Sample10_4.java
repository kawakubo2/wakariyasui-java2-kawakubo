package chapter10;

import lib.Input;

public class Sample10_4 {
    public static void main(String[] args) {
        int total = 0, n;
        while((n = Input.getInt()) != 0) {
            total += n;
        }
        System.out.println("合計=" + total);
    }
}
