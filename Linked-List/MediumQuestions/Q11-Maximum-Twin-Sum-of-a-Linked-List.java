//QUESTION->
//In a linked list of size n, where n is even, the ith node (0-indexed) of the linked list is known as the twin of the (n-1-i)th node, if 0 <= i <= (n / 2) - 1.

// For example, if n = 4, then node 0 is the twin of node 3, and node 1 is the twin of node 2. These are the only nodes with twins for n = 4.
// The twin sum is defined as the sum of a node and its twin.

// Given the head of a linked list with even length, return the maximum twin sum of the linked list.

 

// Example 1:


// Input: head = [5,4,2,1]
// Output: 6
// Explanation:
// Nodes 0 and 1 are the twins of nodes 3 and 2, respectively. All have twin sum = 6.
// There are no other nodes with twins in the linked list.
// Thus, the maximum twin sum of the linked list is 6. 
// Example 2:


// Input: head = [4,2,2,3]
// Output: 7
// Explanation:
// The nodes with twins present in this linked list are:
// - Node 0 is the twin of node 3 having a twin sum of 4 + 3 = 7.
// - Node 1 is the twin of node 2 having a twin sum of 2 + 2 = 4.
// Thus, the maximum twin sum of the linked list is max(7, 4) = 7. 
// Example 3:


// Input: head = [1,100000]
// Output: 100001
// Explanation:
// There is only one node with a twin in the linked list having twin sum of 1 + 100000 = 100001.

//ANSWER-->
//Approach 1: Using ArrayList
class Solution {
    public int pairSum(ListNode head) {
        // Create an ArrayList to store the values of the linked list nodes
        ArrayList<Integer> vec = new ArrayList<>();
        
        // Traverse the entire linked list and store the values in the ArrayList
        while (head != null) {
            vec.add(head.val);  // Add the value of the current node to the list
            head = head.next;    // Move to the next node in the list
        }
        
        int i = 0, j = vec.size() - 1;
        int result = 0;
        
        // Calculate the maximum pair sum by traversing from both ends of the list
        while (i < j) {
            result = Math.max(result, vec.get(i) + vec.get(j));  // Get the maximum pair sum
            i++;  // Move the left pointer to the right
            j--;  // Move the right pointer to the left
        }
        
        // Return the maximum pair sum
        return result;
    }
}

//Approach 2: Using Stack
class Solution {
    public int pairSum(ListNode head) {
        // Initialize a stack to store the values of the linked list nodes
        Stack<Integer> st = new Stack<>();
        ListNode curr = head;
        
        // Traverse the entire linked list and push values onto the stack
        while (curr != null) {
            st.push(curr.val);  // Push the current node's value onto the stack
            curr = curr.next;   // Move to the next node
        }
        
        curr = head;  // Reset the current node pointer to the head of the list
        int count = 1;
        int N = st.size();  // Get the total number of nodes in the linked list
        int result = 0;
        
        // Calculate the maximum pair sum by popping elements from the stack
        // and simultaneously traversing from the head of the list
        while (count <= N / 2) {
            result = Math.max(result, curr.val + st.pop());  // Calculate pair sum
            curr = curr.next;  // Move to the next node in the list
            count++;  // Increment count
        }
        
        // Return the maximum pair sum
        return result;
    }
}


// Approach 3: Reversing the Second Half of the Linked List(My approch)-->
class Solution {
    public int pairSum(ListNode head) {
        // Initialize pointers for the slow and fast pointer approach
        ListNode mid = null;
        
        ListNode slow = head;
        ListNode fast = head;
        
        // Find the middle of the linked list using the slow and fast pointers
        while (fast != null && fast.next != null) {
            slow = slow.next;  // Move slow pointer by one step
            fast = fast.next.next;  // Move fast pointer by two steps
        }
        mid = slow;  // The slow pointer is now at the middle of the list
        
        // Reverse the second half of the linked list starting from 'mid'
        ListNode prev = null;
        while (mid != null) {
            ListNode nextNode = mid.next;  // Store the next node temporarily
            mid.next = prev;  // Reverse the link of the current node
            prev = mid;  // Move prev to the current node
            mid = nextNode;  // Move mid to the next node in the original list
        }
        
        ListNode curr = head;  // Reset the current node pointer to the head of the list
        int result = 0;
        
        // Calculate the maximum pair sum by comparing nodes from the beginning and the reversed second half
        while (prev != null) {
            result = Math.max(result, curr.val + prev.val);  // Calculate pair sum
            curr = curr.next;  // Move to the next node in the first half
            prev = prev.next;  // Move to the next node in the reversed second half
        }
        
        // Return the maximum pair sum
        return result;
    }
}
