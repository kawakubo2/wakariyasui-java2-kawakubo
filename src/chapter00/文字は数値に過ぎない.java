package chapter00;

import java.util.Scanner;

public class 文字は数値に過ぎない {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("名前: ");
        String name = sc.nextLine();

        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i) + ": " + name.codePointAt(i));
        }

        sc.close();
    }
}
