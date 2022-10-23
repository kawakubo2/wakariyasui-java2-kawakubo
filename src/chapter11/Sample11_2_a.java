package chapter11;

public class Sample11_2_a {
    public static void main(String[] args) {
        double x, y;
        x = y = (-1.0 / 3.0);
        if (x < 0) {
            x *= -1;
            y = Math.abs(y);
        }
        System.out.println(x + "の平方根=" + Math.sqrt(x));
        System.out.println(y + "の平方根=" + Math.sqrt(y));
        System.out.println(Math.sqrt(x) == Math.sqrt(y));
    }
}
