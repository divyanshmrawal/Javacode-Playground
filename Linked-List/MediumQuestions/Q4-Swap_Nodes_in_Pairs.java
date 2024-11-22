//QUESTION-->
//Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

// Example 1:
// Input: head = [1,2,3,4]
// Output: [2,1,4,3]
// Explanation:

// Example 2:
// Input: head = []
// Output: []

// Example 3:
// Input: head = [1]
// Output: [1]

// Example 4:
// Input: head = [1,2,3]
// Output: [2,1,3]

//ANSWER-->


//USING Recursion :-------
class Solution {
    public ListNode swapPairs(ListNode head) {
        // If the list is empty or has only one node, return the head as no swap is needed
        if(head == null || head.next == null) {
            return head;
        }

        // Store head.next in a temporary variable so we can update the head node's next
        ListNode temp = head.next;

        // Recursively call swapPairs for the next pair, and update the current head's next
        head.next = swapPairs(head.next.next);

        // Set the next of the second node (temp) to point to the first node (head)
        temp.next = head;

        // Return temp as the new head of the swapped pair
        return temp;
    }
}


//USING Looping :---------
class Solution {
    public ListNode swapPairs(ListNode head) {
        // Base case: If the list is empty or has only one node, return the head as is.
        if (head == null || head.next == null)
            return head;

        // Create a dummy node to help with edge cases and easier list manipulation.
        ListNode res = new ListNode();

        // This will be used to build the new list as we swap nodes.
        ListNode currHead = res;

        // `curr` is used to iterate through the original list.
        ListNode curr = head;

        // Iterate through the list until the end (curr becomes null).
        while (curr != null) {
            // First, set currHead's next pointer to the second node of the pair (i.e., curr.next).
            currHead.next = curr.next;

            // If there is no second node to swap (i.e., the next node is null), attach the remaining node and break out.
            if (curr.next == null) {
                currHead.next = curr;  // Attach the last node (it couldn't be swapped).
                break;  // End the loop as no more pairs exist.
            }

            // Now, `curr.next` points to the second node, so we skip to the node after that for the next iteration.
            curr.next = curr.next.next;

            // Set the `next` of the second node (currHead.next) to point back to the first node (curr).
            currHead.next.next = curr;

            // Move `currHead` to the newly swapped pair's first node (previous second node).
            currHead = curr;

            // Move `curr` to the next pair to continue processing.
            curr = currHead.next;
        }

        // Return the next node of the dummy, which is the new head of the modified list.
        return res.next;
    }
}
