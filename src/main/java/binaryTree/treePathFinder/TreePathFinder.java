package binaryTree.treePathFinder;

import binaryTree.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TreePathFinder {
    public static void main(String[] args) {
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
        List<String> res = pathFinder(a,"e");
        System.out.println(res);
    }
    public static <T> List<T> pathFinder(Node<T> root, T target) {
        List<T> res = pathFinderHelper(root, target);
        if( res != null) {
            Collections.reverse(res);
            return res;
        }
        return null;
    }
    public static <T> List<T> pathFinderHelper(Node<T> root, T target){

        if(root == null){
            return null;
        }
        if(root.val == target){
            List<T> path = new ArrayList<>();
            path.add(root.val);
            return  path;
        }
        List<T> left = pathFinderHelper(root.left, target);
        if(left != null){
            left.add(root.val);
            return left;
        }
        List<T> right = pathFinderHelper(root.right, target);
        if(right != null){
            right.add(root.val);
            return right;
        }
        return null;
    }
}
