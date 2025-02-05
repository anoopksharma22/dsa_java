package binaryTree.breadthFirstSearch;

import binaryTree.ClassicBTreeGenerator;
import binaryTree.Node;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestBreadthFirstSearchIterative {

    @Test
    void testBreadthFirstSearch() {
        Node<String> root = ClassicBTreeGenerator.getClassicBTree();
        List<String> res = BreadthFirstSearchIterative.breadthFirstSearch(root);
        assertEquals(res, List.of("A","B","C","D","E","F"));
    }

    @Test
    void testBreadthFirstSearch2(){
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> f = new Node<>("f");
        Node<String> g = new Node<>("g");
        Node<String> h = new Node<>("h");

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        e.left = g;
        f.right = h;
        List<String> res = BreadthFirstSearchIterative.breadthFirstSearch(a);
        assertEquals(res,List.of("a", "b", "c", "d", "e", "f", "g", "h"));
    }
    @Test
    void testBreadthFirstSearch3(){
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> x = new Node<>("x");

        a.right = b;
        b.left = c;
        c.left = x;
        c.right = d;
        d.right = e;

        List<String> res = BreadthFirstSearchIterative.breadthFirstSearch(a);
        assertEquals(res,List.of("a", "b", "c", "x", "d", "e"));
    }

    @Test
    void testSingleNode(){
        Node<String> a = new Node<>("a");
        assertEquals(BreadthFirstSearchIterative.breadthFirstSearch(a),List.of("a"));
    }

    @Test
    void testNullRoot(){
        assertEquals(BreadthFirstSearchIterative.breadthFirstSearch(null),List.of());
    }
}