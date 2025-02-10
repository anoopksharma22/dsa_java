package binaryTree.bottomRightValue;

import binaryTree.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BottomRightValueTest {

    @Test
    void bottomRightValue() {
        Node<Integer> a = new Node<>(3);
        Node<Integer> b = new Node<>(11);
        Node<Integer> c = new Node<>(10);
        Node<Integer> d = new Node<>(4);
        Node<Integer> e = new Node<>(-2);
        Node<Integer> f = new Node<>(1);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        //       3
        //    /    \
        //   11     10
        //  / \      \
        // 4   -2     1
        assertEquals(1,BottomRightValue.bottomRightValue(a));
    }
    @Test
    void bottomRightValue2() {
        Node<Integer> a = new Node<>(-1);
        Node<Integer> b = new Node<>(-6);
        Node<Integer> c = new Node<>(-5);
        Node<Integer> d = new Node<>(-3);
        Node<Integer> e = new Node<>(-4);
        Node<Integer> f = new Node<>(-13);
        Node<Integer> g = new Node<>(-2);
        Node<Integer> h = new Node<>(6);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        e.left = g;
        e.right = h;
        //        -1
        //      /   \
        //    -6    -5
        //   /  \     \
        // -3   -4   -13
        //     / \
        //    -2  6
        assertEquals(6,BottomRightValue.bottomRightValue(a));
    }
    @Test
    void bottomRightValue3() {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> f = new Node<>("f");

        a.left = b;
        a.right = c;
        b.right = d;
        d.left = e;
        e.right = f;

        //      a
        //    /   \
        //   b     c
        //    \
        //     d
        //    /
        //   e
        //   \
        //    f

        assertEquals("f",BottomRightValue.bottomRightValue(a));
    }
    @Test
    void bottomRightValue4() {
        Node<Integer> a = new Node<>(42);

        //      42

        assertEquals(42,BottomRightValue.bottomRightValue(a));
    }

}