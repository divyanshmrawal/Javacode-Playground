//QUESTION-->
//There is a singly-linked list head and we want to delete a node node in it.

// You are given the node to be deleted node. You will not be given access to the first node of head.

// All the values of the linked list are unique, and it is guaranteed that the given node node is not the last node in the linked list.

// Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean:

// The value of the given node should not exist in the linked list.
// The number of nodes in the linked list should decrease by one.
// All the values before node should be in the same order.
// All the values after node should be in the same order.
// Custom testing:

// For the input, you should provide the entire linked list head and the node to be given node. node should not be the last node of the list and should be an actual node in the list.
// We will build the linked list and pass the node to your function.
// The output will be the entire list after calling your function.
 

// Example 1:
// Input: head = [4,5,1,9], node = 5
// Output: [4,1,9]
// Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.

// Example 2:
// Input: head = [4,5,1,9], node = 1
// Output: [4,5,9]
// Explanation: You are given the third node with value 1, the linked list should become 4 -> 5 -> 9 after calling your function.

//ANSWER-->
class Solution {
    public void deleteNode(ListNode node) {
        // Set the value of the current node to the value of the next node
        node.val = node.next.val;

        // Link the current node to the node after the next node, effectively skipping over the next node
        node.next = node.next.next;
    }
}


// Explanation:
// node.val = node.next.val;    :--
// This line copies the value from the node that comes after the current node (node.next) into the current node (node). This effectively "overwrites" the value of the current node with the value of the next node, making it appear as if the current node is the next node.

// node.next = node.next.next;    :--
// This line adjusts the next pointer of the current node to skip over the next node and point to the node that comes after the next one (node.next.next). By doing this, the next node is effectively removed from the linked list, as the current node now links directly to the node after the next one.