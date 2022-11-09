package test;

public class Shortcut {
    public static void main(String[] args) {
        int a = 10;
        int b = 8;
        int c = 5;
        System.out.printf("a = %d, b = %d, c = %d%n", a, b, c);
        if (a > 5 || (b *= 2) > 10) {
            c *= 2;
        }
        System.out.printf("a = %d, b = %d, c = %d%n", a, b, c);
    }
}
