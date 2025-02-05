package binaryTree.depthFirstSearch;

import binaryTree.ClassicBTreeGenerator;
import binaryTree.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearchIterative {


    public static void main(String[] args) {
        Node<String> a = ClassicBTreeGenerator.getClassicBTree();
        List<String> result = depthFirstSearch(a);
        System.out.println(result);
    }

    public static List<String> depthFirstSearch(Node<String> root){
        if( root == null){
            return List.of();
        }
        Stack<Node<String>> stack = new Stack<>();
        stack.push(root);
        List<String> result = new ArrayList<>();
        while(!stack.isEmpty()){
            Node<String> current = stack.pop();
            result.add(current.val);
            if( current.right != null){
                stack.push(current.right);
            }
            if( current.left != null){
                stack.push(current.left);
            }
        }
        return result;
    }

}
