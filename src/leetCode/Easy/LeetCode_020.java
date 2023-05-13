package src.leetCode.Easy;
/*
给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。

有效字符串需满足：

左括号必须用相同类型的右括号闭合。
左括号必须以正确的顺序闭合。
 */

/*
我的思路：
栈:遍历字符串，如果是左括号数组下标+1，如果是右括号则判断他的前一个括号是不是对应的左括号。
最后通过试错为不同情况进行分类讨论。
 */

public class LeetCode_020 {
    public static void main(String[] args) {
        String s = "({}";//[()[]({})]
        boolean bool = isValid(s);
        System.out.println(bool);
    }

    //2022/05/18
    public static boolean isValid(String s) {
        char[] x = new char[s.length()];
        x[0] = s.charAt(0);
        int i = 0;
        int j = 0;
        int index = 0;
        while (j < s.length()) {
            //int n = s.length();
            x[i] = s.charAt(j);
            //System.out.println(s.charAt(j));

            if (x[i] == '(') {
                index++;
                if(j < s.length() - 1){
                    i++;
                    j++;
                }else {
                    return false;
                }
            }else if (x[i] == '['){
                index++;
                if(j < s.length() - 1){
                    i++;
                    j++;
                }else {
                    return false;
                }
            }else if(x[i] == '{'){
                index++;
                if(j < s.length() - 1){
                    i++;
                    j++;
                }else {
                    return false;
                }
            }else if(x[i] == ')'){
                index--;
                if (i == 0){
                    return false;
                }else if('(' == x[i-1]) {
                    i = i - 1;
                    j++;
                }else{
                    return false;
                }
            }else if(x[i] == ']'){
                index--;
                if (i == 0){
                    return false;
                }else if('[' == x[i-1]) {
                    i = i - 1;
                    j++;
                }else{
                    return false;
                }
            }else if(x[i] == '}'){
                index--;
                if (i == 0){
                    return false;
                }else if('{' == x[i-1]) {
                    i = i - 1;
                    j++;
                }else{
                    return false;
                }
            }
        }if (index == 0){
            return true;
        }else {
            return false;
        }
    }
}
