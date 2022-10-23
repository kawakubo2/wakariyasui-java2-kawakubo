package chapter10;

public class Pass10_6_3 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        int i = 0;
        do {
            System.out.print(a[i]);
            ++i;
        } while (i < a.length);
        System.out.println();
    }
}
