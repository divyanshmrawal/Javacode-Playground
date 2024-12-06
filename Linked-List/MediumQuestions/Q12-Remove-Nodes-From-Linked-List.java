//QUESTION-->
//You are given the head of a linked list.

// Remove every node which has a node with a greater value anywhere to the right side of it.

// Return the head of the modified linked list.

 

// Example 1:


// Input: head = [5,2,13,3,8]
// Output: [13,8]
// Explanation: The nodes that should be removed are 5, 2 and 3.
// - Node 13 is to the right of node 5.
// - Node 13 is to the right of node 2.
// - Node 8 is to the right of node 3.
// Example 2:

// Input: head = [1,1,1,1]
// Output: [1,1,1,1]
// Explanation: Every node has value 1, so no nodes are removed.

//ANSWER-->
class Solution {
    public ListNode removeNodes(ListNode head) {
        // Step 1: Copying elements of the linked list to an array
        ListNode temp = head;
        List<Integer> arr = new ArrayList<>();
        
        // Traverse the linked list and store the values in the array
        while (temp != null) {
            arr.add(temp.val);
            temp = temp.next;
        }
        
        // Step 2: Removing elements from the array based on the condition
        int num = Integer.MIN_VALUE;
        for (int i = arr.size() - 1; i >= 0; i--) {
            if (arr.get(i) >= num) {
                num = arr.get(i);
            } else {
                arr.set(i, null);  // Mark the element for removal
            }
        }
        
        // Step 3: Create a new linked list from the array of valid elements
        ListNode dummy = new ListNode(0);  // Create a dummy node to simplify list construction
        ListNode current = dummy;
        
        for (Integer value : arr) {
            if (value != null) {
                current.next = new ListNode(value);
                current = current.next;
            }
        }
        
        return dummy.next;  // Return the new linked list starting from the first valid node
    }
}
