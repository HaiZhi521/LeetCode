package src.Study_2023_02_18;

import java.math.BigDecimal;

public class BigdecimalTest {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("2");
        BigDecimal b = new BigDecimal("5");
        BigDecimal n = a.subtract(b);
        System.out.println(n);
    }
}
