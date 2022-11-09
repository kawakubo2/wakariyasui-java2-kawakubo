package chapter09;

public class Test1 {
    public static void main(String[] args) {
        for (char c = '0'; c <= '9'; c++) {
            System.out.println(c + "の文字コードは" + (int)c);
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            System.out.println(c + "の文字コードは" + (int)c);
        }
        for (char c = 'a'; c <= 'z'; c++) {
            System.out.println(c + "の文字コードは" + (int)c);
        }
        for (char c = 'ァ'; c <= 'ン'; c++) {
            System.out.println(c + "の文字コードは" + (int)c);
        }
    }
}
