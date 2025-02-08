package binaryTree.depthFirstSearch;

import binaryTree.ClassicBTreeGenerator;
import binaryTree.Node;

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
        depthFirstSearch(btree);
    }

    public static void depthFirstSearch(Node<String> root){
        if( root == null){
            return;
        }
        else {
            System.out.print(root.val + " ");
        }
        depthFirstSearch(root.left);
        depthFirstSearch(root.right);
    }
}

