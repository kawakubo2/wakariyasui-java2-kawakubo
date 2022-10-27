package chapter11;

public class Pass11_2 {
    public static void main(String[] args) {
        int a, b, c, d;
        a = b = c = d = 0;
        double[] height = { 175.2, 160.0, 153.6, 177.5, 185.7, 172.3, 191.3 };
        for (double h: height) {
            if (h < 160) {
                a++;
            } else if (h < 170) {
                b++;
            } else if (h < 180) {
                c++;
            } else {
                d++;
            }
        }
        System.out.printf("A: %d%n", a);
        System.out.printf("B: %d%n", b);
        System.out.printf("C: %d%n", c);
        System.out.printf("D: %d%n", d);
    }
}
