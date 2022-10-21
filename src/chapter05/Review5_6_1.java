package chapter05;

public class Review5_6_1 {
    public static void main(String[] args) {
        int a, b, c;
        b = c = 1;
        a = b += c++;
        System.out.println("a = " + a + " b = " + b + " c = " + c);
    }
}
