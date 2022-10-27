package chapter11;

public class Pass11_5_a {
    public static void main(String[] args) {
        String[] name = { "田中", "前田", "鈴木", "中村", "田辺", "浦川", "島田", "岩田", "加藤" };
        int[] drinking = { 7, 0, 3, 3, 2, 0, 0, 6, 3 };
        int[] smoking = { 60, 10, 0, 20, 10, 0, 30, 0, 30 };

        for (int i = 0; i < name.length; i++) {
            int d = drinking[i];
            int s = smoking[i];
            System.out.printf("%s(%d, %d)\t", name[i], d, s);
            if (d == 0 && s == 0) {
                System.out.println("安全");
            } else if ((d == 0 && s <= 20) || d <= 3 && s == 0) {
                System.out.println("注意");
            } else if (d >= 1 && d <= 3 && s >= 1 && s <= 20) {
                System.out.println("要指導");
            } else if (d >= 4 || s >= 21) {
                System.out.println("要検査");
            }
        }
    }
}
