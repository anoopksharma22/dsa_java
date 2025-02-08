package binaryTree.minValue;

import binaryTree.Node;

public class RecursiveMinValue {
    public static void main(String[] args) {
        Node<Double> a = new Node<>(3.);
        Node<Double> b = new Node<>(11.);
        Node<Double> c = new Node<>(4.);
        Node<Double> d = new Node<>(4.);
        Node<Double> e = new Node<>(-2.);
        Node<Double> f = new Node<>(1.);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        Double minVal = treeMinValue(a);
        System.out.println(minVal);
    }

    public static Double treeMinValue(Node<Double> root) {
        if( root == null ){
            return Double.POSITIVE_INFINITY;
        }
        Double min = Math.min(treeMinValue(root.left), treeMinValue(root.right));
        return Math.min(root.val, min);
    }
}
