//QUESTION-->
//You are given two linked lists: list1 and list2 of sizes n and m respectively.
// Remove list1's nodes from the ath node to the bth node, and put list2 in their place.
// The blue edges and nodes in the following figure indicate the result:
// Build the result list and return its head.

 
// Example 1:
// Input: list1 = [10,1,13,6,9,5], a = 3, b = 4, list2 = [1000000,1000001,1000002]
// Output: [10,1,13,1000000,1000001,1000002,5]
// Explanation: We remove the nodes 3 and 4 and put the entire list2 in their place. The blue edges and nodes in the above figure indicate the result.

// Example 2:
// Input: list1 = [0,1,2,3,4,5,6], a = 2, b = 5, list2 = [1000000,1000001,1000002,1000003,1000004]
// Output: [0,1,1000000,1000001,1000002,1000003,1000004,6]
// Explanation: The blue edges and nodes in the above figure indicate the result.

//ANSWER-->

//                                                            <--Wrong Solution-->
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode prev = new ListNode(); // This will point to the node just before `a`
        ListNode last1 = new ListNode(); // This will point to the node just after `b`
        ListNode last2 = list2; // This will point to the last node of `list2`

        // Step 1: Traverse `list1` to find `prev` (before a) and `last1` (after b)
        while (list1 != null) {
            if (list1.next != null && list1.next.val == a) {
                prev = list1; // `prev` is the node before `a`
            }
            if (list1.val == b) {
                last1 = list1.next; // `last1` is the node after `b`
            }
            list1 = list1.next; // Move to the next node in list1
        }

        // Step 2: Find the last node in `list2`
        while (last2 != null && last2.next != null) {
            last2 = last2.next; // Move to the last node of list2
        }

        // Step 3: Connect `prev` to `list2` and the last node of `list2` to `last1`
        prev.next = list2; // Connect the previous node to the start of list2
        last2.next = last1; // Connect the last node of list2 to the node after `b`

        return list1; // Return the updated `list1`, now merged
    }
}

