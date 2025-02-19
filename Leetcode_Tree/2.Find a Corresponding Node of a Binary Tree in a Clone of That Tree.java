// QUESTION-->
//Given two binary trees original and cloned and given a reference to a node target in the original tree.
/* 
The cloned tree is a copy of the original tree.

Return a reference to the same node in the cloned tree.

Note that you are not allowed to change any of the two trees or the target node and the answer must be a reference to a node in the cloned tree.

Example 1:
Input: tree = [7,4,3,null,null,6,19], target = 3
Output: 3
Explanation: In all examples the original and cloned trees are shown. The target node is a green node from the original tree. The answer is the yellow node from the cloned tree.

*/
//ANSWER-->
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

 class Solution {
    public final TreeNode getTargetCopy(final TreeNode original, final TreeNode cloned, final TreeNode target) {
        // Base case: If original node is null, return null (tree traversal has reached an end).
        if (original == null) {
            return null;
        }
        
        // If we find the target node in the original tree, return the corresponding cloned node.
        if (original == target) {
            return cloned;
        }
        
        // Recursively search in the left subtree.
        TreeNode leftResult = getTargetCopy(original.left, cloned.left, target);
        
        // If target node is found in the left subtree, return it.
        if (leftResult != null) {
            return leftResult;
        }
        
        // Otherwise, continue searching in the right subtree.
        return getTargetCopy(original.right, cloned.right, target);
    }
}
// Time Complexity: O(N)
// Space Complexity: O(N)