package chapter13;

import java.util.Arrays;

import lib.Input;

public class Pass13_4 {
    public static void main(String[] args) {
        String[] names = new String[5];
        for (int i = 0; i < names.length; i++) {
            String name = Input.getString();
            names[i] = name;
        }
        Arrays.sort(names);
        for (String name: names) {
            System.out.println(name);
        }
    }
}
