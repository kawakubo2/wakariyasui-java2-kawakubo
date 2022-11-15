package chapter11;

import lib.Input;

public class Test1 {
    public static void main(String[] args) {
        int sw = Input.getInt("クーポンあり(y…1/n…2)");
        int unitPrice = 1000;
        if (sw == 1) {
            unitPrice = (int)(unitPrice * 0.7);
        }
        System.out.printf("単価=%d円", unitPrice);
        int quantity = Input.getInt("数量");
        System.out.printf("合計金額=%d円%n", unitPrice * quantity);
    }
}
