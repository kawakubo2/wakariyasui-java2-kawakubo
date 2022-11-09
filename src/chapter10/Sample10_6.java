package chapter10;

import lib.Input;

public class Sample10_6 {
    public static void main(String[] args) {
        int cmd;
        do {
            System.out.println("今日は晴れです。");
            cmd = Input.getInt("続ける=1/中止=0");
        } while(cmd == 1);
    }
}
