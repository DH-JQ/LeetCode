package com.hugh.simple;
/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */

/**
 * 问题分析：
 * 难点在于如何查找
 * 1. 暴力循环法，T = O(n2), S = O(1)
 * 2. Map，以value:index存入Map中，仅需一次遍历
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author 杜浩
 */
public class TwoSumSolution {
    //
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer arg = target - nums[i];
            if (map.get(arg) == null) {
                map.put(nums[i], i);
            } else {
                return new int[]{map.get(arg), i};
            }
        }
        throw new IllegalArgumentException("不存在这样的数");
    }

    public static void main(String[] args) {
        TwoSumSolution solution = new TwoSumSolution();
        System.out.println(Arrays.toString(solution.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }
}
