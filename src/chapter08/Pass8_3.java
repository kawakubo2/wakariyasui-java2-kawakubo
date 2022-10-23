package chapter08;

public class Pass8_3 {
    public static void main(String[] args) {
        int[] n = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        for (int i = n.length - 1; i >= 0; i--) {
            System.out.print(n[i]);
        }
        System.out.println();
    }
}
