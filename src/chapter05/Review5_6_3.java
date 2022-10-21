package chapter05;

public class Review5_6_3 {
    public static void main(String[] args) {
        double a = 12.5, b = 1.5;
        int c = 0;
        c = (int) (a + b++);
        System.out.println("a = " + a + " b = " + b + " c = " + c);
    }
}
