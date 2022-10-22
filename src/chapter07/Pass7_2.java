package chapter07;

public class Pass7_2 {
    public static void main(String[] args) {
        int[] numbers1 = { 10, 23, 13, 71, 22 };
        int[] numbers2 = { 2, 3, 5, 3, 4 };
        for (int i = 0; i < 5; i++) {
            System.out.println(numbers1[i] + "×" + numbers2[i] + "=" + (numbers1[i] * numbers2[i]));
        }
    }
}
