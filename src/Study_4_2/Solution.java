package src.Study_4_2;
import java.math.*;


public class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)){
            return false;
        }

        int palindrome = 0;
        while (x > palindrome){
            palindrome = palindrome * 10 + x % 10;
            x/=10;
        }
        return x == palindrome || x == palindrome/10;
    }

    public static void main(String[] args) {
        int x = 11;
        boolean bool = isPalindrome(x);
    }
}
