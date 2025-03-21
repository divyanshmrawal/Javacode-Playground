//QUESTION-->
//You are given the root of a full binary tree with the following properties:
/* 
Leaf nodes have either the value 0 or 1, where 0 represents False and 1 represents True.
Non-leaf nodes have either the value 2 or 3, where 2 represents the boolean OR and 3 represents the boolean AND.
The evaluation of a node is as follows:

If the node is a leaf node, the evaluation is the value of the node, i.e. True or False.
Otherwise, evaluate the node's two children and apply the boolean operation of its value with the children's evaluations.
Return the boolean result of evaluating the root node.

A full binary tree is a binary tree where each node has either 0 or 2 children.

A leaf node is a node that has zero children.

Example 1:
Input: root = [2,1,3,null,null,0,1]
Output: true
Explanation: The above diagram illustrates the evaluation process.
The AND node evaluates to False AND True = False.
The OR node evaluates to True OR False = True.
The root node evaluates to True, so we return true.

Example 2:
Input: root = [0]
Output: false
Explanation: The root node is a leaf node and it evaluates to false, so we return false.
*/
//ANSWER-->
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean evaluateTree(TreeNode root) {
        // Base case: If the root is null, return false (shouldn't occur in a valid input).
        if(root == null){
            return false;
        }

        // If the current node is a leaf node (0 or 1), return its boolean value.
        if(root.left == null && root.right == null){
            return root.val == 1;
        }

        // Recursively evaluate the left and right subtrees.
        boolean leftval = evaluateTree(root.left);
        boolean rightval = evaluateTree(root.right);

        // If the node value is 2, perform logical OR operation on left and right values.
        if(root.val == 2){
            return leftval || rightval;
        }

        // If the node value is 3, perform logical AND operation on left and right values.
        if(root.val == 3){
            return leftval && rightval;
        }

        // If the value is neither 0, 1, 2, or 3, return false (shouldn't occur in a valid input).
        return false;
    }
}
