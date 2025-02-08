package binaryTree.treePathFinder;

import binaryTree.Node;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TreePathFinderTest {

    @Test
    void pathFinder() {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> f = new Node<>("f");

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        //      a
        //    /   \
        //   b     c
        //  / \     \
        // d   e     f

        assertEquals(List.of("a", "b", "e"), TreePathFinder.pathFinder(a, "e"));
    }
    @Test
    void pathFinderTargetNotFound() {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> f = new Node<>("f");

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        //      a
        //    /   \
        //   b     c
        //  / \     \
        // d   e     f


        assertNull(TreePathFinder.pathFinder(a, "p"));
    }
    @Test
    void pathFinderNumber() {
        Node<Integer> root = new Node<>(0);
        Node<Integer> curr = root;
        for (int i = 1; i <= 200; i += 1) {
            curr.right = new Node<>(i);
            curr = curr.right;
        }

        //      0
        //       \
        //        1
        //         \
        //          2
        //           \
        //            3
        //             .
        //              .
        //               .
        //              199
        //                \
        //                200
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i <= 116; i += 1) {
            res.add(i);
        }
        assertEquals(res, TreePathFinder.pathFinder(root, 116));
    }
}