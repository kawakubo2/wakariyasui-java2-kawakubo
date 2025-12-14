package chapter13;

public class Pass13_3_1 {
    public static void main(String[] args) {
        int[][] sales = {
            { 120, 130, 100, 110 },
            { 250, 230, 230, 240 },
            { 105, 110, 120, 125 }
        };
        System.out.print("\t");
        for (int i = 6; i <= 9; i++) {
            System.out.printf("%d月\t", i);
        }
        System.out.println("合計");
        /*
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                System.out.print(sales[i][j] + "\t");
            }
            System.out.println();
        }
        */
        for (int[] fruitSales: sales) {
            int fruitTotal = 0;
            for (int price: fruitSales) {
                System.out.print(price + "\t");
                fruitTotal += price;
            }
            System.out.println(fruitTotal);
        }
    }
}
