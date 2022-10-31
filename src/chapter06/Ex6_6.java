package chapter06;

import lib.Input;

public class Ex6_6 {
    public static void main(String[] args) {
        String str = "ダウンロード:Eclipse IDE for Java Development ａｂｃ!";
        int a = Input.getInt("正の整数");
        System.out.println("---< (1) >---");
        System.out.println(str.charAt(5));
        String name = Input.getString("名前");
        System.out.println(str.indexOf("J"));
        System.out.println(str.length());
        System.out.println(str.toUpperCase());
    }
}
