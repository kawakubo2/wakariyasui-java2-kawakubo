package chapter13;

public class Ex13_2_2 {
    public static void main(String[] args) {
        int[] number;
        number = new int[] {10, 5, 21, 32};
        for (int n: number) {
            System.out.print(n + " ");
        }
        System.out.println();

        printArray(new int[] {1, 2, 3, 4, 5});
    }
    public static void printArray(int[] array) {
        for (int n : array) {
            System.out.print(n + "\t");
        }
        System.out.println();
    }
}
