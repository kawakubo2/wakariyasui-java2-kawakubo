package chapter13;

public class Pass13_3_3 {
    public static void main(String[] args) {
        int[][] sales = {
            { 120, 130, 100, 110 },
            { 250, 230, 230, 240 },
            { 105, 110, 120, 125 }
        };
        String[] name = { "ブドウ", "メロン", "バナナ" };
        System.out.print("\t");
        for (int i = 6; i <= 9; i++) {
            System.out.print(i + "月\t");
        }
        System.out.println("合計");
        for (int i = 0; i < sales.length; i++) {
            System.out.print(name[i] + "\t");
            int fruitTotal = 0;
            for (int j = 0; j < sales[i].length; j++) {
                System.out.print(sales[i][j] + "\t");
                fruitTotal += sales[i][j];
            }
            System.out.println(fruitTotal);
        }

    }
}
