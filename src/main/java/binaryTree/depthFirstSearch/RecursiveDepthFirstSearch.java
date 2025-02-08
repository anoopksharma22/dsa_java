package binaryTree.depthFirstSearch;

import binaryTree.ClassicBTreeGenerator;
import binaryTree.Node;

import java.util.ArrayList;
import java.util.List;

public class RecursiveDepthFirstSearch {
    public static void main(String[] args) {
        Node<String> btree = ClassicBTreeGenerator.getClassicBTree();
        /*
         *     (A)
         *     / \
         *   (B) (C)
         *   / \   \
         * (D) (E)  (F)
         *
         */

        // Output should be: A B D E C F
        List<String> result = new ArrayList<>();
        depthFirstSearch(btree, result);
        System.out.println(result);
    }

    public static List<String> depthFirstSearch(Node<String> root, List<String> res){
        if( root == null){
            return List.of();
        }
        res.add(root.val);
        depthFirstSearch(root.left, res);
        depthFirstSearch(root.right, res);
        return res;
    }
}

