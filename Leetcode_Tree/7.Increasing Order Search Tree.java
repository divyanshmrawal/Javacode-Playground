//QUESTION-->
//Given the root of a binary search tree, rearrange the tree in in-order so that the leftmost node in the tree is now the root of the tree, and every node has no left child and only one right child.

// Example 1:
// Input: root = [5,3,6,2,4,null,8,1,null,null,null,7,9]
// Output: [1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]

// Example 2:
// Input: root = [5,1,7]
// Output: [1,null,5,null,7]

//ANSWER-->
class Solution {
    public TreeNode increasingBST(TreeNode root) {
        ArrayList<Integer> temp = new ArrayList<>();
        inorderTraversal(root, temp); // Perform inorder traversal and store values

        TreeNode dummy = new TreeNode(0); // Dummy node to hold the new tree
        TreeNode curr = dummy; // Pointer to construct the new tree

        for (int val : temp) {
            curr.right = new TreeNode(val); // Create new node
            curr = curr.right; // Move to the next node
        }

        return dummy.right; // Return the right child of dummy, which is the new root
    }

    private void inorderTraversal(TreeNode node, ArrayList<Integer> temp) {
        if (node == null) {
            return;
        }
        inorderTraversal(node.left, temp); // Left subtree
        temp.add(node.val); // Root value
        inorderTraversal(node.right, temp); // Right subtree
    }
}

