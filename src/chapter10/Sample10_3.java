package chapter10;

import lib.Input;

public class Sample10_3 {
    public static void main(String[] args) {
        String str;
        while((str = Input.getString()) != null) {
            System.out.println(str);
        }
    }
}
