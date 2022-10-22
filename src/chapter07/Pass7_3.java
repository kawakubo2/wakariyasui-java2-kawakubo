package chapter07;

public class Pass7_3 {
    public static void main(String[] args) {
        int[] ia = { 102, 98, 122, -97 };
        double[] da = { 12.5, 33.5, -12.7, 18.4, 13.33 };
        String[] sa = { "赤", "青", "黄", "白", "黒", "紫" };

        for (int i = 0; i < 4; i++) {
            System.out.print(ia[i] + "\t");
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            System.out.print(da[i] + "\t");
        }
        System.out.println();

        for (int i = 0; i < 6; i++) {
            System.out.print(sa[i] + "\t");
        }
        System.out.println();
    }
}
