## DepthFirstSearch
Suppose we have this Binary tree.
```
    (A)
    / \
  (B) (C)
  / \
(E) (F) 
```
* Now depth first search means, traversing laterally before traversing to the depth.
* In this example depth first search would be traversing:
```
(A)->(B)->(D)->(E)->(F)
```
### Algorithm for depth first search
#### A) Iterative way
* We can use Queue to implement depth first search
* Queue is Firs In First Out.

##### Steps
1. Start from the root node.
2. Put root node in the queue.
3. Now check iteratively if the Queue is empty
    1. If not empty pop the node and add to the result.
4. Now check if the node has any children.
   1. If yes then add the children to the queue
5. And this loop will continue until the stack is empty.

##### Code example
```java
public class Node<T> {
    public T val;
    public Node left;
    public Node right;

    public Node(T val){
        this.val = val;
        this.left = null;
        this.right = null;
    }

}
```
```java
public class BreadthFirstSearchDemo {


    public static void main(String[] args) {
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
        List<String> result = breadthFirstSearch(a);
        System.out.println(result);
    }

    private static List<String> breadthFirstSearch(Node<String> root) {
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
```
