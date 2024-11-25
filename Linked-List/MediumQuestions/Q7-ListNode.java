//QUESTION-->
//Given the head of a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.You should preserve the original relative order of the nodes in each of the two partitions.

 
// Example 1:
// Input: head = [1,4,3,2,5,2], x = 3
// Output: [1,2,2,4,3,5]


// Example 2:
// Input: head = [2,1], x = 2
// Output: [1,2]

//ANSWER-->

class Solution {
    public ListNode partition(ListNode head, int x) {
        // Create two dummy nodes, list1 for values less than x and list2 for values >= x
        ListNode list1 = new ListNode(0);  
        ListNode list2 = new ListNode(0);

        // Pointers to traverse list1 and list2
        ListNode pointer1 = list1;  
        ListNode pointer2 = list2;

        // Traverse the original list
        while (head != null) {
            // If the current node's value is less than x, add it to list1
            if (head.val < x) {
                pointer1.next = head;  // Append node to list1
                pointer1 = pointer1.next;  // Move pointer1 forward
            } else {
                // If the current node's value is >= x, add it to list2
                pointer2.next = head;  // Append node to list2
                pointer2 = pointer2.next;  // Move pointer2 forward
            }

            // Move to the next node in the original list
            head = head.next;
        }

        // Connect the end of list1 to the start of list2
        pointer1.next = list2.next;

        // Ensure the end of list2 is null to avoid potential cycle
        pointer2.next = null;

        // Return the head of the combined list, which starts at list1.next
        return list1.next;
    }
}
