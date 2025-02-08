package binaryTree.depthFirstSearch;

import binaryTree.Node;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestIterativeDepthFirstSearch {

    @Test
    void depthFirstSearch1() {
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

        List<String> res = IterativeDepthFirstSearch.depthFirstSearch(a);
        assertEquals(res, List.of("a", "b", "d", "e", "c", "f"));
    }
    @Test
    void depthFirstSearch2() {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");
        Node<String> f = new Node<>("f");
        Node<String> g = new Node<>("g");

        a.left = b;
        a.right = c;
        b.left = d;
        b.right = e;
        c.right = f;
        e.left = g;

        List<String> res = IterativeDepthFirstSearch.depthFirstSearch(a);
        assertEquals(res, List.of("a", "b", "d", "e", "g", "c", "f"));
    }

    @Test
    void depthFirstSearch3() {
        Node<String> a = new Node<>("a");
        Node<String> b = new Node<>("b");
        Node<String> c = new Node<>("c");
        Node<String> d = new Node<>("d");
        Node<String> e = new Node<>("e");

        a.right = b;
        b.left = c;
        c.right = d;
        d.right = e;

        List<String> res = IterativeDepthFirstSearch.depthFirstSearch(a);
        assertEquals(res, List.of("a", "b", "c", "d", "e"));
    }

    @Test
    void depthFirstSearch4() {
        List<String> res = IterativeDepthFirstSearch.depthFirstSearch(null);
        assertEquals(res, List.of());
    }
    @Test
    void depthFirstSearch5() {
        Node<String> a = new Node<>("a");
        List<String> res = IterativeDepthFirstSearch.depthFirstSearch(a);
        assertEquals(res, List.of("a"));
    }
}