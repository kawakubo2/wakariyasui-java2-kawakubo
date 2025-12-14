package chapter09.second;

import java.util.Random;

import lib.Input;

public class Sample10_6 {
    public static void main(String[] args) {
        String[] tenki = {"今日は晴れです。", "今日は曇りです。", "今日は雨です。",
                          "今日は曇りのち晴れです。", "今日は曇りのち雨です。", 
                          "今日は晴れのち曇りです。", "今日は晴れのち雨です。",
                          "今日は雨のち曇りです。", "今日は雨のち晴れです。"};
        Random rand = new Random();
        int cmd;
        do {
            System.out.println(tenki[rand.nextInt(tenki.length)]);
            cmd = Input.getInt("続ける=1/中止=0: ");
        } while (cmd == 1);
    }
}
