package src.Study_5_10;

import java.time.LocalDate;
import java.util.Date;

public class LocalData {
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(s.matches(".*he.*"));
        Date date = new Date();
        date.toString();
        System.out.println(date);
//        LocalDate today = LocalDate.of(1999,12,31);
//        int year = today.getYear();
//        int month = today.getMonthValue();
//        int day = today.getDayOfMonth();
//        System.out.println(year);
//        System.out.println(month);
//        System.out.println(day);
//        System.out.println(today);
    }
}
