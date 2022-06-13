package src.Study_5_10;

import java.time.LocalDate;

public class LocalData {
    public static void main(String[] args) {
        LocalDate today = LocalDate.of(1999,12,31);
        int year = today.getYear();
        int month = today.getMonthValue();
        int day = today.getDayOfMonth();
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
        System.out.println(today);
    }
}
