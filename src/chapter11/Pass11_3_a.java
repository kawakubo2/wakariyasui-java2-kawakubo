package chapter11;

import lib.Input;

public class Pass11_3_a {
    public static void main(String[] args) {
        String[] season = {"冬", "春", "夏", "秋"};
        int month;
        while ((month = Input.getInt()) != 0) {
            if (month < 0 || month > 12) {
                System.out.println("?");
            } else {
                System.out.println(season[(month % 12) / 3]);
            }
        }
    }
}
