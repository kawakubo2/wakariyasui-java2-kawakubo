package chapter11;

import java.util.HashMap;
import java.util.Map;

import lib.Input;

public class Pass11_1_a {
    public static void main(String[] args) {
        Map<String, String> animals = new HashMap<>();
        animals.put("dog", "いぬ");
        animals.put("cat", "ねこ");
        animals.put("mouse", "ねずみ");
        animals.put("rabbit", "うさぎ");
        String animal;
        while ((animal = Input.getString()) != null) {
            if (animals.containsKey(animal)) {
                System.out.println(animals.get(animal));
            } else {
                System.out.println("?");
            }
        }
    }
}
