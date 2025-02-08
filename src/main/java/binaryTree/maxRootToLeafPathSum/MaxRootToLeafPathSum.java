package binaryTree.maxRootToLeafPathSum;

import binaryTree.Node;

public class MaxRootToLeafPathSum {

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

        //       3
        //    /    \
        //   11     4
        //  / \      \
        // 4   -2     1

        Double sum = maxPathSum(a);
        System.out.println(sum);
    }
    public static Double maxPathSum(Node<Double> root) {
        if( root == null ){
            return Double.NEGATIVE_INFINITY;
        }
        if( root.left == null && root.right == null){
            return root.val;
        }
        Double max = Math.max(maxPathSum(root.left),maxPathSum(root.right));
        return max + root.val;

    }
}
