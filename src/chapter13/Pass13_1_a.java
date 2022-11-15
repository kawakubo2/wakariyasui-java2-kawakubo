package chapter13;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Pass13_1_a {
    public static void main(String[] args) {
        double[] temp = { 20.5, 23.4, 26.1, 28.5, 33.5, 29.1 };
        System.out.println(Arrays.toString(temp));

        /*
        中級編ではMapとして定義するようになる。
        putメソッドの第1引数が月、第2引数が気温で管理しやすい。
        */
        Map<Integer, Double> temp2 = new TreeMap<>();
        temp2.put(4, 20.5);
        temp2.put(5, 23.4);
        temp2.put(6, 26.1);
        temp2.put(7, 28.5);
        temp2.put(8, 33.5);
        temp2.put(9, 29.1);

        int[][] sales = {
            { 120, 130, 100, 110 },
            { 250, 230, 230, 240 },
            { 105, 110, 120, 125 }
        };
        System.out.println(Arrays.toString(sales));
        Map<String, Map<Integer, Integer>> sales2 = new LinkedHashMap<>();
        sales2.put("ブドウ", Map.of(6, 120, 7, 130, 8, 100, 9, 110));
        sales2.put("メロン", Map.of(6, 250, 7, 230, 8, 230, 9, 240));
        sales2.put("バナナ", Map.of(6, 105, 7, 110, 8, 120, 9, 125));
    }
}
