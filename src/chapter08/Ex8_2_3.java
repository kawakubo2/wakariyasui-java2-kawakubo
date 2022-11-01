package chapter08;

public class Ex8_2_3 {
    public static void main(String[] args) {
        double[] weight = {55.3, 60.5, 62.5, 50.2, 48.8};
        double total = 0;
        for (int i = 0; i < weight.length; i++) {
            total += weight[i];
        }
        System.out.println("合計=" + total);
        System.out.println("平均=" + ((double)total / weight.length)) ;
    }
}
