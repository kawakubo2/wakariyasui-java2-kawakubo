package chapter13;

public class Pass13_2_1 {
    public static void main(String[] args) {
        double[] temp = { 20.5, 23.4, 26.1, 28.5, 33.5, 29.1 };

        // バブルソート
        for (int i = 0; i < temp.length - 1; i++) {
            for (int j = temp.length - 1; j > i; j--) {
                if (temp[j - 1] > temp[j]) {
                    double t = temp[j];
                    temp[j] = temp[j - 1];
                    temp[j - 1] = t;
                }
            }
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + "\t");
        }
        System.out.println();


        /*
        Arrays.sort(temp);
        for (double t : temp) {
            System.out.print(t + "\t");
        }
        System.out.println();
        */
    }
}
