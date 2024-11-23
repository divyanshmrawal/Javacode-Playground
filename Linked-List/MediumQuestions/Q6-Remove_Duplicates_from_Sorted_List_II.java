/* 
 * QUESTION-->
 * 
 * Q-Given the head of a sorted linked list, delete all nodes that have duplicate numbers, leaving only distinct numbers from the original list. Return the linked list sorted as well.


Example 1:
Input: head = [1,2,3,3,4,4,5]
Output: [1,2,5]

Example 2:
Input: head = [1,1,1,2,3]
Output: [2,3]
 * 
 * ANSWER-->
*/
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        // Create a dummy node which will help simplify edge cases (like removing the first node)
        ListNode dummy = new ListNode(-1); 
        // The dummy node points to the head of the list
        dummy.next = head;
        
        // `prev` points to the node just before the current node, which we need to possibly modify
        ListNode prev = dummy;
        // `temp` is used to traverse the list
        ListNode temp = head;

        // Traverse the list
        while (temp != null) {
            // Check if the current node has a duplicate
            if (temp.next != null && temp.val == temp.next.val) {
                // Skip all the nodes with the same value (duplicate nodes)
                while (temp.next != null && temp.val == temp.next.val) {
                    temp = temp.next; // Move to the next node
                }
                // Skip all duplicates by setting prev.next to temp.next
                prev.next = temp.next;
            } else {
                // If no duplicates, simply move prev to the current node
                prev = prev.next;
            }
            // Move to the next node in the list
            temp = temp.next;
        }

        // Return the modified list starting from the node after the dummy node
        return dummy.next;
    }
}
