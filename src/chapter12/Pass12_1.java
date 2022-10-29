package chapter12;

import lib.Input;

public class Pass12_1 {
    public static void main(String[] args) {
        String code = Input.getString("商品コード");
        int unitPrice = switch (code) {
            case "a100" -> 100;
            case "a110" -> 200;
            case "b100" -> 100;
            case "b110" -> 200;
            case "b120" -> 200;
            case "c100" -> 300;
            case "c110" -> 300;
            case "d100" -> 400;
            default -> 0;
        };
        if (unitPrice == 0) {
            System.out.println("商品コードが間違っています。");
            System.exit(1);
        }
        int quantity = Input.getInt("商品の数量");
        System.out.println("合計金額=" + (unitPrice * quantity));
    }
}
