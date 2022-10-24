package chapter11;

import lib.Input;

public class Pass11_3 {
    public static void main(String[] args) {
        int month;
        while ((month = Input.getInt()) != 0) {
            if (month == 12 || month == 1 || month == 2) {
                System.out.println("冬");
            } else if (month >= 3 && month <= 5) {
                System.out.println("春");
            } else if (month >= 6 && month <= 8) {
                System.out.println("夏");
            } else if (month >= 9 && month <= 11) {
                System.out.println("秋");
            } else {
                System.out.println("?");
            }
        }
    }
}
