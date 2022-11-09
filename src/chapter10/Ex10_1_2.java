package chapter10;

import lib.Input;

public class Ex10_1_2 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 2) {
            int n = Input.getInt();
            System.out.println(n);
            i++;
        }
    }
}
