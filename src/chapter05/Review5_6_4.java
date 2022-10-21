package chapter05;

public class Review5_6_4 {
    public static void main(String[] args) {
        int n = 0;
        boolean b;
        n++;
        // b = (boolean)n;
        b = Boolean.valueOf(n + "");
        System.out.println(Boolean.valueOf("true"));
        System.out.println(Boolean.valueOf("false"));
        System.out.println(b);
    }

}
