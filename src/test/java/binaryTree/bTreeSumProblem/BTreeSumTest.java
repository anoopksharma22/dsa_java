package binaryTree.bTreeSumProblem;

import binaryTree.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BTreeSumTest {

    @Test
    void treeSum() {
        Node<Integer> a = new Node<>(3);
        Node<Integer> b = new Node<>(11);
        Node<Integer> c = new Node<>(4);
        Node<Integer> d = new Node<>(4);
        Node<Integer> e = new Node<>(-2);
        Node<Integer> f = new Node<>(1);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        assertEquals(21,BTreeSum.treeSum(a));
    }
    @Test
    void treeSum2() {
        Node<Integer> a = new Node<>(1);
        Node<Integer> b = new Node<>(6);
        Node<Integer> c = new Node<>(0);
        Node<Integer> d = new Node<>(3);
        Node<Integer> e = new Node<>(-6);
        Node<Integer> f = new Node<>(2);
        Node<Integer> g = new Node<>(2);
        Node<Integer> h = new Node<>(2);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        e.left = g;
        f.right = h;

        assertEquals(10,BTreeSum.treeSum(a));
    }
    @Test
    void treeSumNull() {
        assertEquals(0,BTreeSum.treeSum(null));
    }
}