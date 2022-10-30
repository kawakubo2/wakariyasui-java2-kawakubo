package chapter13;

import java.util.Arrays;

public class Ex13_4_1 {
    public static void main(String[] args) {
        String[] words = { "book", "paper", "book", "pencil", "note", "eraser" };
        Arrays.sort(words);
        for (String w: words) {
            System.out.println(w);
        }
    }
}
