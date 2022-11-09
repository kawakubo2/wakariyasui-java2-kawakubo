package test;

public class over1000 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 1; i <= 100; i++) {
            total += i;
            if (total > 1000) {
                break;
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }


    }
}
