## DepthFirstSearch
Suppose we have this Binary tree.
```
    (A)
    / \
  (B) (C)
  / \
(E) (F) 
```
* Now depth first search means, traversing to the max depth before traversing laterally.
* In this example depth first search would be traversing:
```
(A)->(B)->(E)->(F)->(C)
```
### Algorithm for depth first search
#### A) Iterative way
* We can use Stack to implement depth first search

##### Steps
1. Start from the root node.
2. Put root node in the stack.
3. Now check iteratively if the stack is empty
    1. If not empty pop the node and add to the result.
4. Now put both the child of the popped node on the stack.
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
public class DepthFirstSearchIterative {


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
        List<String> result = depthFirstSearch(a);
        System.out.println(result);
    }

    public static List<String> depthFirstSearch(Node<String> root){
        if( root == null){
            return List.of();
        }
        Stack<Node> stack = new Stack<>();
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
```

