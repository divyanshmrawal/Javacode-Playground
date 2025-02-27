//QUESTION->
//You are given the root of a binary tree that consists of exactly 3 nodes: the root, its left child, and its right child.
/* 
Return true if the value of the root is equal to the sum of the values of its two children, or false otherwise.

Example 1:
Input: root = [10,4,6]
Output: true
Explanation: The values of the root, its left child, and its right child are 10, 4, and 6, respectively.
10 is equal to 4 + 6, so we return true.


Example 2:
Input: root = [5,3,1]
Output: false
Explanation: The values of the root, its left child, and its right child are 5, 3, and 1, respectively.
5 is not equal to 3 + 1, so we return false.
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
    public boolean checkTree(TreeNode root) {
        //Base case that if root is null then return false
        if(root == null){
            return false;
        }

        //if both children node is not null then 
        //check that sum of the child node is equals to root value 
        //if yes then return true otherwise return false
        if(root.left!=null && root.right!=null){
            return root.val==(root.left.val+root.right.val);
        }

        //by default false
        return false;
    }
}
