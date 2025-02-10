package binaryTree.bottomRightValue;

import binaryTree.Node;

import java.util.ArrayDeque;
import java.util.Queue;

public class BottomRightValue {
    public static void main(String[] args) {
        Node<Integer> a = new Node<>(-1);
        Node<Integer> b = new Node<>(-6);
        Node<Integer> c = new Node<>(-5);
        Node<Integer> d = new Node<>(-3);
        Node<Integer> e = new Node<>(-4);
        Node<Integer> f = new Node<>(-13);
        Node<Integer> g = new Node<>(-2);
        Node<Integer> h = new Node<>(6);
        Node<Integer> i = new Node<>(7);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        e.left = g;
        e.right = h;
        f.left = i;

        //        -1
        //      /   \
        //    -6    -5
        //   /  \     \
        // -3   -4   -13
        //     / \    /
        //    -2  6  7

        System.out.println(bottomRightValue(a));

    }
    public static <T> T bottomRightValue(Node<T> root) {
        Queue<Node<T>> queue = new ArrayDeque<>();
        if(root != null){
            queue.add(root);
        }
        Node<T> current = null;
        while(!queue.isEmpty()){
            current = queue.remove();
            if( current.left!=null){
                queue.add(current.left);
            }
            if( current.right!=null){
                queue.add(current.right);
            }
        }
        return current.val;
    }
}
