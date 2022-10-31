package chapter06;

import javax.swing.event.SwingPropertyChangeSupport;

public class Test2 {
    public static void main(String[] args) {
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println(s.length());
        System.out.println(s.substring(0, 5));
        System.out.println(s.substring(5, 10));
        System.out.println(s.substring(10, 15));
        System.out.println(s.substring(15, 20));
        System.out.println(s.substring(20, 25));
        System.out.println(s.substring(25, 26));

            
    }
}
