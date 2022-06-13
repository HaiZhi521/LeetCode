package src.leetCode;
//罗马数字包含以下七种字符:I，V，X，L，C，D和M。
//
//        字符          数值
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000
//        例如， 罗马数字 2 写做II，即为两个并列的 1 。12 写做XII，即为X+I。 27 写做XXVII, 即为XX+V+II。
//
//        通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做IIII，而是IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为IX。这个特殊的规则只适用于以下六种情况：
//
//        I可以放在V(5) 和X(10) 的左边，来表示 4 和 9。
//        X可以放在L(50) 和C(100) 的左边，来表示 40 和90。
//        C可以放在D(500) 和M(1000) 的左边，来表示400 和900。
//        给定一个罗马数字，将其转换成整数。

public class LeetCode_013 {
    public static int romanToInt(String s) {
        int num = 0;

        char [] stringArr = s.toCharArray();
        System.out.println(stringArr.length);
        for(int i = 0;i < stringArr.length;i++ ){
            //System.out.println(stringArr[i]);
            String str = "IVXLCDM";
            System.out.println(str.substring(1,2));
            System.out.println(s.substring(0,1).compareTo(str.substring(1,2)));
            if(str.substring(0,1) == s.substring(i,i+1)){
                num += 1;
                System.out.println(num);
            }else if (str.substring(1,2) == s.substring(i,i+1)){
                num += 5;
            }else if(str.substring(2,3) == s.substring(i,i+1)){
                num += 10;
            }else if(str.substring(3,4) == s.substring(i,i+1)){
                num += 50;
            }else if (str.substring(4,5) == s.substring(i,i+1)){
                num +=100;
            }else if (str.substring(5,6) == s.substring(i,i+1)){
                num += 500;
            }else if (str.substring(6,7) == s.substring(i,i+1)){
                num +=1000;
            }
        }

        return num;
    }

    public static void main(String[] args) {
        String str = "VII";
        int num = romanToInt(str);
        System.out.println(num);
    }
}
