package chapter07;

public class Ex7_5_4 {
    public static void main(String[] args) {
        int[] n1 = {12, 11, 31};
        int[] n2 = {26, 14, 12};
        if (n1.length != n2.length) {
            System.err.println("要素数が一致しません");
            System.exit(1);
        }
        for (int i = 0; i < n1.length; i++) {
            System.out.printf("%d+%d=%d%n", n1[i], n2[i], n1[i] + n2[i]);
        }
    }
}
