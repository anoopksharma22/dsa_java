## Binary Tree
```
        (A) <- Root node, has no parent
        / \
      (B) (C)
      /     
     (D) <- D is parent of E and F
     / \
   (E) (F) <- E,F leaf node
```
### Criteria to be binary tree
1. Has only one root node.
2. Has two children at most.
3. Only one path b/w root to any node.
   1. path is series of connected nodes. eg: to reach (F) path would be (A)->(B)->(D)->(E)->(F)
4. Empty tree (tree with no node) is also considered a binary tree.

### One Tricky example
```
   (A)
   / \
(B)--(C)
```
* This is not a binary tree.
* The is no single root.
* This has a cyclic path
  * Hence, there are infinite number of paths between node.

