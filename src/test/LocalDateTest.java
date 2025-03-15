package test;

import java.time.LocalDate;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();

        LocalDate firstdate = LocalDate.of(today.getYear(), today.getMonthValue(), 1);
        System.out.println(firstdate);
        
        System.out.println(firstdate.getDayOfWeek());
    }
}
