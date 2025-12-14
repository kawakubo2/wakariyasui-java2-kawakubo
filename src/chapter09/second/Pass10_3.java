package chapter09.second;

import lib.Input;

public class Pass10_3 {
    public static void main(String[] args) {
        int cnt = 0;
        double d;
        while ((d = Input.getDouble()) != 0) {
            if (d >= 10) cnt++;
        }
        System.out.println("10以上の数値は" + cnt + "個");
    }
}
