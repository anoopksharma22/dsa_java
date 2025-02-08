## Max root to leaf path sum

Suppose we have this binary tree
```
       3
    /    \
   11     4
  / \      \
 4   -2     1

```
Now we need to find the sum of max root to leaf.
* It means we need to find a path from the root node to leaf node, which has the maximum sum.
* In this example it would be:
  * 3->11->4 => 18;

Best way to solve this problem is `Recursive approach`

### Base cases:
* Leaf node:
  * left child is null
  * right chile is null
  * so return self value
* Node is null
  * return the max min value, in case of Java: `Double.NEGATIVE_INFINITY`

### Logic:
* Add the current node value with max of chile node values.
* so in current example it would be:
  * After removing base cases:
    * we get  4, -2 and 1
    * max 4 , -2 => 4
      * 11 + 4 => 15
    * max 15, 4 => 15
      * 3 + 15 => 18

