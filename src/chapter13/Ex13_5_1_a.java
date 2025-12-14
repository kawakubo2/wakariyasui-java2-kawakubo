package chapter13;

public class Ex13_5_1_a {
    public static void main(String[] args) {
        double[][] temp = {
            { -2.0, 7.0, 6.1, 6.6, 16.9 },
            { 5.5, 12.4, 13.6, 13.8, 21.2 },
            { 22.1, 18.9, 27.9, 27.7, 28.7 },
            { 12.2, 28.9, 19.9, 20.0, 25.7 }
        };
        String[] month = {"1月", "4月", "7月", "10月", "平均"};
        double[] cityTotal = new double[5];
        for (int i = 0; i < temp.length; i++) {
            double total = 0;
            System.out.print(month[i]);
            for (int j = 0; j < temp[i].length; j++) {
                cityTotal[j] += temp[i][j];
                total += temp[i][j]; 
                System.out.printf("%6.1f", temp[i][j]);
            }
            System.out.printf("%6.1f%n", total / 5);
        }
        System.out.println();
        System.out.print(month[4]);
        for (int i = 0; i < temp[0].length; i++) {
            System.out.printf("%6.1f", cityTotal[i] / 4);
        }
        System.out.println();
    }
}
