package binaryTree.treeValueCount;

import binaryTree.Node;

public class TreeValueCount {
    public static void main(String[] args) {
        Node<Integer> a = new Node<>(12);
        Node<Integer> b = new Node<>(6);
        Node<Integer> c = new Node<>(6);
        Node<Integer> d = new Node<>(4);
        Node<Integer> e = new Node<>(6);
        Node<Integer> f = new Node<>(12);

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;

        //      12 3
        //   2/   \1
        //   6     6
        // 0/ \1    \0
        // 4   6     12

        int res = treeValueCount(a, 6);
        System.out.println(res);
    }

    public static <T> int treeValueCount(Node<T> root, T val){
        if( root == null ){
            return 0;
        }
        int count = 0;
        if( root.val == val){
            count++;
        }
        int leftCount = treeValueCount(root.left, val);
        int rightCount = treeValueCount(root.right, val);
        return count + leftCount + rightCount;
    }
}
