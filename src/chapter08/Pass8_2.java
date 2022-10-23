package chapter08;

public class Pass8_2 {
    public static void main(String[] args) {
        String[] names = { "田中", "中村", "鈴木", "山本", "本田" };
        double[] scores = { 82.0, 85.0, 74.0, 90.0, 70.0 };

        // 見出し
        for (String name : names) {
            System.out.print(name + "\t");
        }
        System.out.println("平均");

        // 得点と平均
        double total = 0.0;
        for (double score : scores) {
            System.out.print(score + "\t");
            total += score;
        }
        System.out.println((total / scores.length));

    }

}
