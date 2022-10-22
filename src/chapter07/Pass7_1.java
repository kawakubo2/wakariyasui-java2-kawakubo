package chapter07;

public class Pass7_1 {
    public static void main(String[] args) {
        String[] str = { "月", "火", "水", "木", "金", "土", "日" };
        System.out.println("---------< 解1 >---------");
        for (int i = 0; i < 7; i++) {
            System.out.print(str[i] + "\t");
        }
        System.out.println();

        System.out.println("---------< 解2 >---------");
        // 第8章のlengthを使用
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + "\t");
        }
        System.out.println();

        System.out.println("---------< 解3 >---------");
        // 第8章の拡張for文を使用
        for (String s : str) {
            System.out.print(s + "\t");
        }
    }
}