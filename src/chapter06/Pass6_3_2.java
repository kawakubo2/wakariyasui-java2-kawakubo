package chapter06;

public class Pass6_3_2 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int p = (int)(Math.random() * 6) + 1;
            if (p < 1 || p > 6) {
                System.out.println("想定外の乱数が発生しました。");
                break;
            }
            System.out.println(p);
        }
    }
}
