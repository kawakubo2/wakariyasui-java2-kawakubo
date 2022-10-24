package chapter11;

import lib.Input;

public class Pass11_1 {
    public static void main(String[] args) {
        String animal;
        while ((animal = Input.getString()) != null) {
            if ("dog".equals(animal)) {
                System.out.println("いぬ");
            } else if ("cat".equals(animal)) {
                System.out.println("ねこ");
            } else if ("mouse".equals(animal)) {
                System.out.println("ねずみ");
            } else if ("rabbit".equals(animal)) {
                System.out.println("うさぎ");
            } else {
                System.out.println("?");
            }
        }
    }
}
