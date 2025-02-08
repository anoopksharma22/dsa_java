package binaryTree;

/**
 * Factory class to generate classic sting btree
 *     (A)
 *     / \
 *   (B) (C)
 *   / \   \
 * (D) (E)  (F)
 *
 */

public class ClassicBTreeGenerator {

    /**
     *
     * @return btree
     */
    public static Node<String> getClassicBTree(){
        Node<String> a = new Node<>("A");
        Node<String> b = new Node<>("B");
        Node<String> c = new Node<>("C");
        Node<String> d = new Node<>("D");
        Node<String> e = new Node<>("E");
        Node<String> f = new Node<>("F");
        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.left = f;
        return a;
    }


}
