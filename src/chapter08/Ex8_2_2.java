package chapter08;

public class Ex8_2_2 {
    public static void main(String[] args) {
        double[] x = {2.5, 2.1, 1.8, 4.12, 3.15, 2.8};
        double total = 0;
        for (int i = 0; i < x.length; i++) {
            total += x[i];
        }
        System.out.println("合計=" + total);
    }    
}
