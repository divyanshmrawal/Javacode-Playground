//QUESTION-->
//Given the root of an n-ary tree, return the postorder traversal of its nodes' values.

// Nary-Tree input serialization is represented in their level order traversal. Each group of children is separated by the null value (See examples)

// Example 1:
// Input: root = [1,null,3,2,4,null,5,6]
// Output: [5,6,3,2,4,1]

// Example 2:
// Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
// Output: [2,6,14,11,7,3,12,8,4,13,9,10,5,1]

//ANSWER-->
/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
*/

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>(); // List to store postorder traversal
        
        // Base case: If the root is null, return an empty list
        if (root == null) return result;

        // Recursively traverse all the children of the current node
        for (Node child : root.children) {
            result.addAll(postorder(child)); // Collect the values from the subtree
        }

        // Add the current node's value after visiting all its children
        result.add(root.val);

        return result; // Return the final postorder traversal list
    }
}
