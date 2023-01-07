package src.Study_2023_01_06;

public class BinaryCalculation {
    public static void main(String[] args) {
//        String str =
//        int x = 0;
//        String s = Integer.toBinaryString(x);
//        s += 1;
//        x += 1;
//        System.out.println(x);
//        System.out.println(s);
//        s += 2;
//        x += 2;
//        System.out.println(x);
//        System.out.println(s);
//        int x = 0;
//        x += 1;
//        String s2 = Integer.toBinaryString(x);
//        String s16 = Integer.toHexString(x);;
//        //int xx = s & 1;
//        System.out.println(s2);
//        System.out.println(s16);
//        x += 2;
//        s2 = Integer.toBinaryString(x);
//        s16 = Integer.toBinaryString(x);
//        System.out.println(s2);
//        System.out.println(s16);
//        x += 16;
//        s2 = Integer.toBinaryString(x);
//        s16 = Integer.toBinaryString(x);
//
//        System.out.println(s2);
//        System.out.println(s16);


        int i = Integer.valueOf(1 | 8);
        //int i = 8;
        //String s = Integer.toHexString(i);
        String s=Integer.toHexString(Integer.valueOf(i));
        s = String.format("%08x",Integer.valueOf(s));
        System.out.println(i);
        System.out.println(s);
    }
}
