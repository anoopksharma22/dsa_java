package binaryTree.minValue;

import binaryTree.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItterativeMinValueBreadthFirstTest {

    @Test
    void treeMinValue() {
        Node<Double> a = new Node<>(-1.);
        Node<Double> b = new Node<>(-6.);
        Node<Double> c = new Node<>(-5.);
        Node<Double> d = new Node<>(-3.);
        Node<Double> e = new Node<>(-4.);
        Node<Double> f = new Node<>(-13.);
        Node<Double> g = new Node<>(-2.);
        Node<Double> h = new Node<>(-2.);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        e.left = g;
        f.right = h;

        assertEquals(-13.0, ItterativeMinValueBreadthFirst.treeMinValue(a));
    }

    @Test
    void treeMinValueSingleNode(){
        Node<Double> a = new Node<>(42.);
        assertEquals(42.0, ItterativeMinValueBreadthFirst.treeMinValue(a));
    }
}