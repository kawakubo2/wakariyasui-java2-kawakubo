package test;

public class SeasonTest {
    public static void main(String[] args) {
        Season[] seasons = Season.values();
        for (Season s: seasons) {
            System.out.println(s);
        }
        System.out.println(Season.SPRING.getCode());
        System.out.println(Season.SUMMER.getCode());
        System.out.println(Season.AUTUMN.getCode());
        System.out.println(Season.WINTER.getCode());
        System.out.println(Season.SPRING.getName());
        System.out.println(Season.SUMMER.getName());
        System.out.println(Season.AUTUMN.getName());
        System.out.println(Season.WINTER.getName());
        System.out.println(Season.SPRING);
        System.out.println(Season.SUMMER);
        System.out.println(Season.AUTUMN);
        System.out.println(Season.WINTER);
    }
}
