package src.Study_3_19;

public class StringDemo {
    public static void main(String[] args) {
        String s = "Help!";

        //substring(1,4):包括1但不包括4。
        String s1 = s.substring(1,4);

        //字符串截取和拼接。
        String s2 = s.substring(0,3)+"p!";

        //equals和==的区别
        //结果为true
        boolean bool = s.equals(s2);
        //结果为false
        boolean bool1 = s == s2;

        //StringBuilder类
        StringBuilder builder = new StringBuilder();
        builder.append("Help!");
        String Str = builder.toString();


        System.out.println(builder);
        System.out.println(Str);
    }
}
