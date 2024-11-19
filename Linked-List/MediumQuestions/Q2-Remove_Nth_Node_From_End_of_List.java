//QUESTION-->
//Given the head of a linked list, remove the nth node from the end of the list and return its head.

// Example 1:

// Input: head = [1,2,3,4,5], n = 2
// Output: [1,2,3,5]
// Example 2:

// Input: head = [1], n = 1
// Output: []
// Example 3:

// Input: head = [1,2], n = 1
// Output: [1]

//ANSWRE-->

// 1st Approch (Faster and Slowe pointer) :--

/*Approach :
Dummy Node: Introduce a dummy node pointing to the head of the list. This allows us to handle cases where the node to be removed is the head, as the dummy node provides a consistent "previous" node.

Two Pointers: Use two pointers, first and second, both initially pointing to the dummy node.

Advance first Pointer: Move the first pointer n + 1 steps ahead of second. This will create a gap of n nodes between first and second.

Move Both Pointers: Move both pointers one step at a time until first reaches the end of the list. At this point, second is right before the node to remove.

Remove the Target Node: Adjust the next pointer of second to skip the target node.

Return the New Head: Return dummy.next as the new head of the list. */

//code:--

//class Solution {
public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0); // Dummy node to simplify edge cases
    dummy.next = head;

    ListNode first = dummy;
    ListNode second = dummy;

    // Move `first` n+1 steps ahead to create the necessary gap
    for (int i = 0; i <= n; i++) {
        first = first.next;
    }

    // Move both `first` and `second` until `first` reaches the end
    while (first != null) {
        first = first.next;
        second = second.next;
    }

    // Remove the nth node from the end
    second.next = second.next.next;

    return dummy.next; // Return the head of the modified list
}

// Time Complexity: O(sz)
// Space Complexity: O(1)

// 2nd Approch (Basic Maths) :--

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode i = head;
        int length = 0;

        //Finding lenght of list 
        while (i != null) {
            length++;
            i = i.next;
        }//while closed

        int count = length - n;
        if (count == 0) {
            return head.next;
        }//if closed

        ListNode last = head;

        for (int temp = 0; temp < count - 1; temp++) {
            last = last.next;
        }//for closed

        last.next = last.next.next;
        return head;
    }
}

// Time Complexity: O(l)
// Space Complexity: O(1)