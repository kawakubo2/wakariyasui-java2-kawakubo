package chapter13;

import lib.Input;

public class Ex13_3_1 {
    public static void main(String[] args) {
        double[] data = new double[5]; // 配列変数の宣言とヒープ領域の確保
        for (int i = 0; i < data.length; i++) {
            data[i] = Input.getDouble(); // 要素への代入
        }
        for (double d : data) {
            System.out.print(d + " "); // 要素の参照
        }
        System.out.println();
    }
}
