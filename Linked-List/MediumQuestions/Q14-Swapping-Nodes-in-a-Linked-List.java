//QUESTION-->
//You are given the head of a linked list, and an integer k.

// Return the head of the linked list after swapping the values of the kth node from the beginning and the kth node from the end (the list is 1-indexed).

 

// Example 1:
// Input: head = [1,2,3,4,5], k = 2
// Output: [1,4,3,2,5]


// Example 2:
// Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
// Output: [7,9,6,6,8,7,3,0,9,5]

//ANSWER-->
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        int len = 0;
        ListNode temp = head;
        
        // Calculate the length of the list
        while (temp != null) {
            len++;
            temp = temp.next;
        }

        // Find the k-th node from the beginning (1-based index)
        ListNode first = head;
        for (int i = 1; i < k; i++) {
            first = first.next;
        }

        // Find the k-th node from the end (1-based index)
        ListNode last = head;
        for (int i = 1; i < len - k + 1; i++) {
            last = last.next;
        }

        // Swap the values of the k-th node from the beginning and the end
        int tempVal = first.val;
        first.val = last.val;
        last.val = tempVal;

        return head;
    }
}
