package com.hugh.simple;
/**
 * 思路分析:
 * 1. 哈希表存储所有基本罗马数字组合
 * I    1
 * V    5
 * X    10
 * L    50
 * C    100
 * D    500
 * M    1000
 * IV   4
 * IX   9
 * XL   50
 * XC   90
 * CD   500
 * CM   900

 * 2. 从索引为1开始
 *  2.1 前提条件index + 2 < length，判断roman.substring(index, index+2)是否存在
 *      存在，则加value，索引+2
 *      不存在，则加index的value，索引+1
 */

import java.util.HashMap;

/**
 * 将罗马数字转换成阿拉伯数字
 * @author 杜浩
 */
public class RomanToInt {
    public int romanToInt(String roman) {
        HashMap<String, Integer> romanMap = new HashMap<>();
        romanMap.put("I", 1);
        romanMap.put("II", 2);
        romanMap.put("V", 5);
        romanMap.put("X", 10);
        romanMap.put("L", 50);
        romanMap.put("C", 100);
        romanMap.put("D", 500);
        romanMap.put("M", 1000);
        romanMap.put("IV", 4);
        romanMap.put("IX", 9);
        romanMap.put("XL", 40);
        romanMap.put("XC", 90);
        romanMap.put("CD", 400);
        romanMap.put("CM", 900);
        int result = 0;
        if (roman == null || "".equals(roman)) {
            return 0;
        }
        for (int i = 0; i < roman.length(); ) {
            if (i+1 < roman.length() && romanMap.containsKey(roman.substring(i, i+2))) {
                result += romanMap.get(roman.substring(i, i+2));
                i += 2;
            } else if (romanMap.containsKey(roman.substring(i, i+1))){
                result += romanMap.get(roman.substring(i, i+1));
                i += 1;
            } else {
                throw new IllegalArgumentException("输入参数有误");
            }
        }
        if (result > 3999) {
            throw new IllegalArgumentException("数值范围超过了3999");
        }

        return result;
    }
}
