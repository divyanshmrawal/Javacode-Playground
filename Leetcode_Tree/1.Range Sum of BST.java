//QUESTION-->
//Given the root node of a binary search tree and two integers low and high, return the sum of values of all nodes with a value in the inclusive range [low, high].

 /* 

Example 1:
Input: root = [10,5,15,3,7,null,18], low = 7, high = 15
Output: 32
Explanation: Nodes 7, 10, and 15 are in the range [7, 15]. 7 + 10 + 15 = 32.


Example 2:
Input: root = [10,5,15,3,7,13,18,1,null,6], low = 6, high = 10
Output: 23
Explanation: Nodes 6, 7, and 10 are in the range [6, 10]. 6 + 7 + 10 = 23.
*/
//ANSWER-->

class Solution {
    int ans = 0;  // Global variable to store the sum of node values in the given range

    public int rangeSumBST(TreeNode root, int low, int high) {
        if (root == null) {
            return 0;  // Base case: if the node is null, return 0
        }

        // If the current node value is within the range [low, high], add it to the sum
        if (root.val >= low && root.val <= high) {
            rangeSumBST(root.left, low, high);  // Recur for the left subtree
            ans += root.val;  // Add the node's value to ans
            rangeSumBST(root.right, low, high); // Recur for the right subtree
        }
        
        // If the current node's value is less than low, we can ignore the left subtree
        else if (root.val < low) {
            rangeSumBST(root.right, low, high);
        }

        // If the current node's value is greater than high, we can ignore the right subtree
        else if (root.val > high) {
            rangeSumBST(root.left, low, high);
        }

        return ans;  // Return the accumulated sum
    }
}
// Time complexity:O(n)
// Space complexity:O(n)