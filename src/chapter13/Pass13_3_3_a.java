package chapter13;

import java.util.LinkedHashMap;
import java.util.Map;

public class Pass13_3_3_a {
    public static void main(String[] args) {
        Map<String, Map<Integer, Integer>> sales2 = new LinkedHashMap<>();
        sales2.put("ブドウ", Map.of(6, 120, 7, 130, 8, 100, 9, 110));
        sales2.put("メロン", Map.of(6, 250, 7, 230, 8, 230, 9, 240));
        sales2.put("バナナ", Map.of(6, 105, 7, 110, 8, 120, 9, 125));

        int[] months = {6, 7, 8, 9};
        // 見出し
        System.out.print("\t");
        for (int month: months) {
            System.out.printf("%d月\t", month);
        }
        System.out.println("合計");

        // 明細
        for (String fruitName: sales2.keySet()) {
            System.out.print(fruitName + "\t");
            Map<Integer, Integer> sales = sales2.get(fruitName);
            int fruitTotal = 0;
            for (int month: months) {
                System.out.print(sales.get(month) + "\t");
                fruitTotal += sales.get(month);
            }
            System.out.println(fruitTotal);
        }
    }
}
