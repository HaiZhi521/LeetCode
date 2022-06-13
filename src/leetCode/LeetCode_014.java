package src.leetCode;

/*
编写一个函数来查找字符串数组中的最长公共前缀。

如果不存在公共前缀，返回空字符串 ""。
 */

/*
我的思路：
把字符串数组中的每个元素挨个对比，并把相同的部分作为新的字符串与下一个对比。
 */
public class LeetCode_014 {
    public static void main(String[] args) {
        String[] str = {"dog","racecar","car"};
        String s = longestCommonPrefix(str);
        System.out.print(s);
    }

    //2022/05/18
    public static String longestCommonPrefix(String[] strs) {
        //int length = strs.length;
        String n = "";
        String s = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String si = strs[i];
            for (int j = 0; j < s.length() && j < si.length() ; j++) {
                if(s.charAt(j) == si.charAt(j)){
                    n = n + s.charAt(j);
                }else {
                    j = s.length();
                    s = n;
                }
            }
            s = n;
            n = "";
        }
        return s;
    }
}
