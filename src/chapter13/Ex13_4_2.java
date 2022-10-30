package chapter13;

import java.util.Arrays;

import lib.Input;

public class Ex13_4_2 {
    public static void main(String[] args) {
        String[] words = { "book", "paper", "book", "pencil", "note", "eraser" };
        Arrays.sort(words);
        String word = Input.getString();
        int pos = Arrays.binarySearch(words, word);
        System.out.printf("検索結果=%d%n", pos);
    }
}
