package chapter07;

public class Sample7_1 {
    public static void main(String[] args) {
         int[] n = {3, 5, 10, 14, 28};
         double[] x = {0.3, 1.05, 2.3};
         char[] c = {'お', 'は', 'よ', 'う'};
         String[] s = {"おはよう", "こんにちは", "こんばんは"};
         boolean[] b = {true, false, true, true};
        
         s[0] = "Good Morning";
         System.out.println(s[0]);
         System.out.println(s[1]);
         System.out.println(s[2]);
    }
}
