package binaryTree;

public class Node<T> {
    public T val;
    public Node left;
    public Node right;

    public Node(T val){
        this.val = val;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
