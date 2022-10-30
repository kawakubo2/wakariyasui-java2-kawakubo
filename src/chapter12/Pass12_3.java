package chapter12;

public class Pass12_3 {
    public static void main(String[] args) {
        double[] val = {1.5, -12, 3.8, -12.0, -25.1, 32, 0.812, 25, 33};
        for (double v : val) {
            if (v < 0) continue;
            if (v < 1 || v > 100) break;
            System.out.printf("%.1f\t%f%n", v, Math.sqrt(v));
        }
    }
}
