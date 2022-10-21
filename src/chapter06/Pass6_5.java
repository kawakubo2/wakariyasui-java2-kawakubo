package chapter06;

import lib.Input;

public class Pass6_5 {
    public static void main(String[] args) {
        String str1 = Input.getString();
        if (str1.matches("^(?=.*[a-z])(?=.*.*?5.+?5.*).{10,}$")) {
            System.out.println("---< 文字列の要件を満たしてます >---");
            System.out.println("文字数=" + str1.length());
            System.out.println("先頭から5文字=" + str1.substring(0, 5));
            System.out.println("先頭から7文字目=" + str1.charAt(6));
            String str2 = str1.replace('5', '0');
            System.out.println("str2=" + str2);
            String str3 = str2.toUpperCase();
            System.out.println("str3=" + str3);
        } else {
            System.out.println("---< 文字列の要件を満たしていません >---");
        }
    }
}
