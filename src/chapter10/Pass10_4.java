package chapter10;

import lib.Input;

public class Pass10_4 {
    public static void main(String[] args) {
        String str, msg = "";
        while ((str = Input.getString()) != null) {
            msg += str;
        }
        System.out.println(msg);
    }
}
