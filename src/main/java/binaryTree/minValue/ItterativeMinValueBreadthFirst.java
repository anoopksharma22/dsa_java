package binaryTree.minValue;

import binaryTree.Node;

import java.util.ArrayDeque;
import java.util.Deque;

public class ItterativeMinValueBreadthFirst {
    public static void main(String[] args) {
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

        Double min = treeMinValue(a);
        System.out.println("Min val: " + min);
    }
    public static Double treeMinValue(Node<Double> root){
        Deque<Node<Double>> queue = new ArrayDeque<>();
        Double min = Double.POSITIVE_INFINITY;
        if(root != null){
            queue.push(root);
        }
        while (!queue.isEmpty()){
            Node<Double> current = queue.pop();
            if( current.val < min ){
                min = current.val;
            }
            if( current.left != null)
                queue.push(current.left);
            if(current.right != null)
                queue.push(current.right);
        }
        return min;
    }
}
