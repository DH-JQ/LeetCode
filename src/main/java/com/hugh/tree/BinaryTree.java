package com.hugh.tree;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * 二叉树遍历
 * 按照前序的方式压栈
 * 前序遍历：根左右 第一次遇见时输出
 * 中序遍历：左根右 第二次遇见时输出
 * 中序遍历：左右根 第三次遇见时输出
 * @author 杜浩
 */
public class BinaryTree {

    private BinaryTree() {

    }

    /**
     * 后序遍历
     * @param tree
     * @return
     */
    public static List<String> lastOrder(Node tree) {
        Node lastOut = null; // 标记上一个节点
        Node t = tree;  // 当前指向节点
        Stack<Node> stack = new Stack<>();  // 临时存储栈
        List<String> list = new ArrayList<>();
        // 若节点不为空或栈不为空，则压栈
        t = tree;
        if (t == null) {
            System.out.println("空栈");
            return null;
        }
        // 节点非空，或栈不为空，执行遍历压栈和弹栈
        while (t != null || !stack.isEmpty()) {
            // 向左压栈
            while (t != null) {
                // 第一次相遇
                stack.push(t);
                t = t.getLeft();
            }

            // 每次压完栈，要向上回溯，找到最近的父节点，
            while (!stack.isEmpty()) {
                // 第二次相遇，也可能是第三次相遇
                // 弹栈
                t = stack.pop();

                if (t.getRight() == null || t.getRight() == lastOut) {
                    // 没有右子节点，或上一个弹出的节点是右子节点
                    System.out.println(t.getData());
                    list.add(t.getData());
                    lastOut = t; // 更新弹出节点
                    t = null; // 为什么要将t置为null？弹出根节点后，栈为空，但t!=null，又将从根节点开始遍历。
//                   // 弹出父节点后，继续循环弹栈回溯上一级父节点
                } else {
                    // 右子树未遍历，父节点压会栈，转向右子树压栈操作
                    stack.push(t); // 下一次见就是第三次了
                    t = t.getRight(); // 转向右子树
                    break;
                }
            }
        }
        return list;
    }

    /**
     * 求树深度
     * @param tree
     * @return
     */
    public static int postOrderGetHeight(Node tree) {
        int leftHeight = 0;
        int rightHeight = 0;
        if (tree.getLeft() != null) {
            leftHeight = postOrderGetHeight(tree.getLeft());
        }
        if (tree.getRight() != null) {
            rightHeight = postOrderGetHeight(tree.getRight());
        }
        int maxHeight = Math.max(leftHeight, rightHeight);

        return maxHeight + 1;
    }

    public static List<String> LevelOrderTravel(Node tree) {
        if (tree == null) {
            return null;
        }
        LinkedList<Node> queue = new LinkedList<>(); // FIFO队列，存放节点
        List<String> list = new LinkedList<>();

        queue.add(tree);
        while (!queue.isEmpty()) {
            // 取值
            Node poll = queue.poll();
            if (poll.getLeft() != null) {
                queue.add(poll.getLeft());
            }

            if (poll.getRight() != null) {
                queue.add(poll.getRight());
            }
            System.out.println(poll.getData());
            list.add((poll.getData()));
        }
        return list;

    }
}
