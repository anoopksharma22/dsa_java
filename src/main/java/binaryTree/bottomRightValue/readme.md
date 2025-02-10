## Bottom right value
### Problem statement:
Write a method, bottomRightValue, that takes in the root of a binary tree. The method should return the right-most value in the bottom-most level of the tree.

You may assume that the input tree is non-empty.

### Examples:
```
//       3
//    /    \
//   11     10
//  / \      \
// 4   -2     1
```
Above should return: 1

```
//        -1
//      /   \
//    -6    -5
//   /  \     \
// -3   -4   -13
//     / \    /   
//    -2  6  7 
```
Above should return: 7
* In above example, `7` seems to be left chile of `-13`, still is the deepest right most chile of the complete tree and hence answer is `7`

### Approach
#### Algorithm to use: `Breadth first search`
* In breadth first search we got entire breadth before going down, hence this is the best solution for this problem
* Simply at the last level we go from left to right and return the last value.
* It is very important to process the element from left to right.
* Hence `queue` is the best data structure to solve this problem.
* Just make sure to add the left chile first and then right chile. `fifo`;

```java
public static <T> T bottomRightValue(Node<T> root) {
    Queue<Node<T>> queue = new ArrayDeque<>();
    if(root != null){
      queue.add(root);
    }
    Node<T> current = null;
    while(!queue.isEmpty()){
      current = queue.remove();
      if(current.left!=null){
        queue.add(current.left);
      }
      if(current.right!=null){
        queue.add(current.right);
      }
    }
    return current.val;
  }
```