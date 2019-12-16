package com.hugh.simple;
/**
 * 判断回文数
 * 判断首尾，如果
 */

/**
 * @author 杜浩
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x){
        if (x < 0) {
            // 负值
            return false;
        }
        if (x<10)
            // 小于10,肯定是回文
            return true;
        int div = 1;
        int y = x/10;
        while (y != 0) {
            y /= 10;
            div *= 10;
        }

        while (y >= 10) {
            int left = y / div;
            int right = y % 10;
            if (left != right){
                return false;
            }
            div /= 100;
            y = y%10/10;
        }
        return true;
    }
}
