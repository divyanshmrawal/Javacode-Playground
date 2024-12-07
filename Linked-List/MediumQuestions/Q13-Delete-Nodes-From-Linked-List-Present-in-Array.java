//QUESTION-->
//You are given an array of integers nums and the head of a linked list. Return the head of the modified linked list after removing all nodes from the linked list that have a value that exists in nums.

 

// Example 1:
// Input: nums = [1,2,3], head = [1,2,3,4,5]
// Output: [4,5]
// Explanation:
// Remove the nodes with values 1, 2, and 3.


// Example 2:
// Input: nums = [1], head = [1,2,1,2,1,2]
// Output: [2,2,2]
// Explanation:
// Remove the nodes with value 1.


// Example 3:
// Input: nums = [5], head = [1,2,3,4]
// Output: [1,2,3,4]
// Explanation:



// No node has value 5.

//ANSWER-->
//Approach (Using Simple straight forward approach)
//T.C : O(n)
//S.C : O(n)
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        // Convert array to a set for O(1) lookup
        HashSet<Integer> st = new HashSet<>();
        for (int num : nums) {
            st.add(num);
        }

        // Skip the nodes at the start of the list that are present in the set
        while (head != null && st.contains(head.val)) {
            head = head.next;
        }

        // Now process the rest of the list
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            if (!st.contains(curr.val)) {
                // Move prev and curr forward
                prev = curr;
                curr = curr.next;
            } else {
                // Skip the current node
                if (prev != null) {
                    prev.next = curr.next;
                }
                curr = curr.next;
            }
        }

        return head;
    }
}