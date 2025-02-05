package binaryTree.bTreeSumProblem;

import binaryTree.Node;

import java.util.Stack;

public class BTreeSum {
    public static void main(String[] args) {
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

        int sum = treeSum(a);
        System.out.println(sum);
    }
    public static int treeSum(Node<Integer> root) {
        Stack<Node<Integer>> stack = new Stack<>();
        int sum = 0;
        if( root != null){
            stack.push(root);
        }
        while (!stack.isEmpty()){
            Node<Integer> current = stack.pop();
            sum += current.val;
            if( current.right != null)
                stack.push(current.right);
            if(current.left !=null)
                stack.push(current.left);
        }
        return sum;
    }
}
