package chapter08;

public class ArrayReverse {
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50, 60};
        int last = data.length - 1;
        for (int i = 0; i < data.length / 2; i++) {
            int tmp = data[i];
            data[i] = data[last - i];
            data[last - i] = tmp;
        }
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + "\t");
        }
        System.out.println();
    }
}
