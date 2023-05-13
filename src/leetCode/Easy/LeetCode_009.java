package src.leetCode.Easy;

//回文数：简单
//给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
//
//        回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

/*
首先排除掉特殊情况:
1.负数肯定不是回文数
2.回文数最后一位一定不是0（0本身除外）

我的思路：
将这个数字每一位给取出来，然后首尾对比
 */
/*
题解思路：
1：反转数字的一半（如果把数字转成字符串然后检查字符串是否是回文会产生额外的内存空间;如果把数字全部反转有可能会导致整数溢出）
怎么反转数字的一半：
eg：
12321->(1232,1)->(123,12)->(12,123)
1221->(122,1)->(12,12)
 */

public class LeetCode_009 {
    public static void main(String[] args) {
        int x = 88888;
        boolean bool = isPalindrome(x);
        System.out.print(bool);
    }


    public static boolean isPalindrome(int x) {
        /*
        1.负数肯定不是
        2.0是特殊情况，也需要排除，最后一位是0（0除外）也肯定不是
         */
        //反转一半的数字解法。2022/05/17
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        } else if (x == 0) {
            return true;
        } else {
            int half = 0;
            int i = 0;
            while (x > half) {
                half = x % 10 + half * 10;
                x = x / 10;
                i++;
                if (half == x) {
                    return true;
                } else if (half / 10 == x) {
                    return true;
                }
            }
            return false;
        }
    }
}