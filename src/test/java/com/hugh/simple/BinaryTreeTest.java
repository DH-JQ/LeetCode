package com.hugh.simple;

import com.hugh.tree.BinaryTree;
import com.hugh.tree.Node;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Stack;

/**
 * @author 杜浩
 */
public class BinaryTreeTest {
    private static Node tree;
    @BeforeAll
    public static void init() {
        Node node1 = new Node();
        node1.setData("0");

        Node node2 = new Node();
        node2.setData("1");

        Node node3 = new Node();
        node3.setData("2");
        node3.setLeft(node1);
        node3.setRight(node2);

        Node node5 = new Node();
        node5.setData("4");

        Node node4 = new Node();
        node4.setData("3");
        node4.setLeft(node3);
        node4.setRight(node5);

        tree = node4;

    }

    /**
     * 后续遍历
     */
    @Test
    public void testLastOrder() {
        List<String> strings = BinaryTree.lastOrder(tree);
        System.out.println(strings);
    }

    @Test
    public void testGetHeight() {
        int height = BinaryTree.postOrderGetHeight(tree);
        System.out.println(height);
    }

    @Test
    public void testLevelOrder() {
        List<String> strings = BinaryTree.LevelOrderTravel(tree);
        System.out.println(strings);
    }
}
