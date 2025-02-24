//QUESTION-->
//

//ANSWER-->

class Solution {

    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        // Base cases: if either of the trees is null, return the other tree
        if (root1 == null) return root2;
        if (root2 == null) return root1;

        // Create a new node by summing values from both trees
        TreeNode merge = new TreeNode(root1.val + root2.val);

        // Recursively merge the left and right subtrees
        merge.left = mergeTrees(root1.left, root2.left);
        merge.right = mergeTrees(root1.right, root2.right);

        return merge; // Return the merged tree's root
    }
}
