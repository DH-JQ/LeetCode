package com.hugh.simple;

/**
 * 遍历strs[0]
 *  遍历比较其它的字符，比strs长度小或字符不同，则返回结果strs[0].substring[0, i]，
 *  对应字符相同，进入下一次循环
 * @author 杜浩
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        Character c;
        int i = 0;
        for (i = 0; i < strs[0].length(); i++) {
            c = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length() || !c.equals(strs[j].charAt(i))) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0].substring(0, i);
    }
}
