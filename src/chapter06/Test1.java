package chapter06;

public class Test1 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String s3 = "JavaScript";

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);
        
        String s4 = s3.substring(0, 4);
        System.out.println(s4);
        System.out.println(s1.equals(s4));
        System.out.println(s1 == s4);
    }
}
