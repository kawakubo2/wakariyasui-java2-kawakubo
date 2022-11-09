package test;

import lib.Input;

public class RangeCheck {
    public static void main(String[] args) {
        int score;
        do {
            score = Input.getInt("0～100の整数値");
        } while (score < 0 || score > 100);
    }
}
