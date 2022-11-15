package chapter12;

public class Kuku {
    public static void main(String[] args) {
        int count = 0;
        outer:
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <=9; j++) {
                count++;
                if (i * j > 30) {
                    break outer; // ラベル付きbreak文
                }
                System.out.printf("%3d", i * j);
            }
            System.out.println();
        }
        System.out.println("回数" + count);
    }
}
