package chapter06;

public class test3 {
    public static void main(String[] args) {
        double x = 1234.567890123;
        System.out.printf("%10f%n", x); // 小数部の桁数指定を省略した場合小数点第6位まで表示
        System.out.printf("%10.2f%n", x); // 小数部の桁数指定を省略した場合小数点第6位まで表示
        System.out.printf("%,10.2f%n", x); // 小数部の桁数指定を省略した場合小数点第6位まで表示
        System.out.printf("%+,10.2f%n", x); // 小数部の桁数指定を省略した場合小数点第6位まで表示

    }
    
}
