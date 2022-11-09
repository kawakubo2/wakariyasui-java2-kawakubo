package chapter10;

import lib.Input;

public class Sample10_2 {
    public static void main(String[] args) {
        int n;
        while((n = Input.getInt()) != 0) {
            System.out.println(n + "を入力");
        }
    }
}
