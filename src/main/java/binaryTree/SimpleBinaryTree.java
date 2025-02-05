package binaryTree;

public class SimpleBinaryTree {
    public static void main(String[] args) {
        Node<Integer> a = new Node<>(10);
        Node<Integer> b = new Node<>(20);
        Node<Integer> c = new Node<>(30);

        a.left = b;
        a.right = c;

        System.out.println(a.left.val);
        System.out.println(a.right.val);
    }
}
