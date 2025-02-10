## Tree value count
Given the binary tree:<br>
Write a method, treeValueCount, that takes in the root of a binary tree and a target value. The method should return the number of times that the target occurs in the tree
```
//      12
//    /   \
//   6     6
//  / \     \
// 4   6     12
```
For example:
```
treeValueCount(a,  6); --> 3
```

### Approach
* We can solve this problem either by depth first or breadth first approach.
* Depth first search using recursive call is preferred.

#### Base cases:
* If node is null return 0, it means the target is not found.
* Define a counter with initial value 0 and if node is equal to the target then increment the counter.
* Call the function recursively for both left abd right children.
* Add the count + left count + right count

```java
public static <T> int treeValueCount(Node<T> root, T val){
        if( root == null ){
            return 0;
        }
        int count = 0;
        if( root.val == val){
            count++;
        }
        int leftCount = treeValueCount(root.left, val);
        int rightCount = treeValueCount(root.right, val);
        return count + leftCount + rightCount;
    }
```