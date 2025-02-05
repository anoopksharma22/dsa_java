package binaryTree.breadthFirstSearch;

import binaryTree.ClassicBTreeGenerator;
import binaryTree.Node;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearchIterative {
    public static void main(String[] args) {
        Node<String> root = ClassicBTreeGenerator.getClassicBTree();
        List<String> result = breadthFirstSearch(root);
        System.out.println(result);
    }

    public static List<String> breadthFirstSearch(Node<String> root) {
        Queue<Node<String>> queue = new ArrayDeque<>();
        List<String> result = new ArrayList<>();
        if( root != null){
            queue.add(root);
        }
        while (!queue.isEmpty()){
            Node<String> current = queue.remove();
            result.add(current.val);
            if( current.left != null)
                queue.add(current.left);
            if( current.right != null)
                queue.add(current.right);
        }

        return result;
    }

}
