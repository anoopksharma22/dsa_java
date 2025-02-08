package binaryTree.minValue;

import binaryTree.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class RecursiveMinValueTest {

    @Test
    void minValue(){
        Node<Double> a = new Node<>(5.);
        Node<Double> b = new Node<>(11.);
        Node<Double> c = new Node<>(3.);
        Node<Double> d = new Node<>(4.);
        Node<Double> e = new Node<>(14.);
        Node<Double> f = new Node<>(12.);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        assertEquals(3.0, RecursiveMinValue.treeMinValue(a));
    }
  
}