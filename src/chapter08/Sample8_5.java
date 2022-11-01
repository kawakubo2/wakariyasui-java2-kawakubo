package chapter08;

public class Sample8_5 {
    public static void main(String[] args) {
        int[] data = {10, 20, 30, 40, 50, 60};
        for (int i = data.length; i >= 0; i--) {
            System.out.print(data[i] + "\t");
        }
        System.out.println();
    }
}
