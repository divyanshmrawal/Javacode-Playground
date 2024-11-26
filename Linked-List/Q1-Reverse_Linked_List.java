//Using 3 pointer :--
class Solution{
    public ListNode reverseList(ListNode head) {
        // We start with three pointers:
        // 1. prev: This will keep track of the previous node we processed (starts as null).
        // 2. next: This will keep track of the next node to process.
        // 3. curr: This is the current node we are processing (starts as the head of the list).
        ListNode prev = null;
        ListNode next = null;
        ListNode curr = head;

        // We loop through the linked list until we reach the end (when curr is null).
        while (curr != null) {
            // Store the next node in the list. We need to do this because we will change the current node's next pointer.
            next = curr.next;

            // Reverse the link. Instead of pointing to the next node, the current node now points to the previous node.
            curr.next = prev;

            // Move the previous pointer to the current node (since the current node is now processed).
            prev = curr;

            // Move the current pointer to the next node (to continue processing the rest of the list).
            curr = next;
        }

        // When we've processed all nodes, the prev pointer will be at the new head of the reversed list.
        return prev;
    }
}

// Time complexity:O(n)
// Space complexity:O(1)    

//******************************************************************************[==]*******************************************************************************

// Using Stack
import java.util.Stack;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class LinkedListReverseUsingStack {

    public static ListNode reverseLinkedList(ListNode head) {
        // Step 1: Use a stack to store the nodes
        Stack<ListNode> stack = new Stack<>();
        ListNode current = head;

        // Traverse the linked list and push each node onto the stack
        while (current != null) {
            stack.push(current);
            current = current.next;
        }

        // Step 2: Pop nodes from the stack and reconstruct the reversed list
        if (stack.isEmpty()) {
            return null;  // Return null if the list is empty
        }

        // Start with the last node in the stack (which will be the new head)
        ListNode newHead = stack.pop();
        current = newHead;

        // Pop the rest of the nodes and link them in reverse order
        while (!stack.isEmpty()) {
            ListNode node = stack.pop();
            current.next = node;
            current = current.next;
        }

        // The new tail should point to null
        current.next = null;

        return newHead;
    }

    // Helper function to print the linked list
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Helper function to create a linked list from an array of values
    public static ListNode createLinkedList(int[] values) {
        if (values.length == 0) return null;
        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }
        return head;
    }

    // Example Usage
    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        ListNode head = createLinkedList(values);

        System.out.println("Original List:");
        printList(head);

        ListNode reversedHead = reverseLinkedList(head);
        System.out.println("Reversed List:");
        printList(reversedHead);
    }
}
// Time complexity:O(n)
// Space complexity:O(n)  
