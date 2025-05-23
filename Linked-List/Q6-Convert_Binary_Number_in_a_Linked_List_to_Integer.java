//QUESTION-->
//Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.

// Return the decimal value of the number in the linked list.

// The most significant bit is at the head of the linked list.

 

// Example 1:


// Input: head = [1,0,1]
// Output: 5
// Explanation: (101) in base 2 = (5) in base 10
// Example 2:

// Input: head = [0]
// Output: 0

//ANSWER->
class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode temp=head;
        int size=0;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int i=size-1;
        temp=head;
        int ans=0;
        while(temp!=null){
            if(temp.val==1){
                ans+=Math.pow(2,i);
            }
            i--;
            temp=temp.next;
        }
        return ans;
    }
}
