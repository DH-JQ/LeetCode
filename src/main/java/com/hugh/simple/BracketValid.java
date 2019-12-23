package com.hugh.simple;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 思路
 * Stack临时存储
 * Map 映射查找key，没有则入栈，有则弹栈并比较value
 *
 * @author 杜浩
 */
public class BracketValid {
    public boolean isValid(String s) {
        // 准备stack 和 Map
        Map<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');

        Stack<Character> stack = new Stack<>();
        // 遍历循环
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (map.containsKey(c)) {
                // 有括号
                Character topElement = stack.empty()?'#':stack.pop();
                // 如果为空或不相等，则false
                if (!topElement.equals(map.get(c))) {
                    return false;
                }
            } else {
                // 左括号入栈
                stack.push(c);
            }
        }
        // 如果栈不为空，有多余的
        return stack.isEmpty();
    }
}
