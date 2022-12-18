package chapter09.second;

import lib.Input;

public class Exec9_5 {
    public static void main(String[] args) {
        int year = Input.getInt("西暦の年を入力してください: ");
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.printf("西暦%d年は閏年です。%n", year);
        } else {
            System.out.printf("西暦%d年は閏年ではありません。%n", year);
        }
    }

}
